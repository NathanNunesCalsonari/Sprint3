package com.example.controller;

import java.sql.SQLException;

import com.example.data.ClienteDAO;
import com.example.model.Cliente;
import com.example.model.LocalDoAcidente;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML 
    TextField txtNome;
    @FXML 
    TextField txtCPF;
    @FXML 
    TextField txtApolice;
    @FXML 
    TextField txtEnderecoAcidente;
    @FXML 
    ListView<Cliente> lista;

    ClienteDAO dao = new ClienteDAO();

    public void solicitarGuincho() {
        var guincho = new Cliente(
            txtNome.getText(),
            txtCPF.getText(),
            Integer.valueOf(txtApolice.getText()),
            txtEnderecoAcidente.getText()

        );

        try {
            dao.inserir(guincho);
            limparListaSolicitacoes();
            atualizarListaSolicitacoes();
        } catch (SQLException e) {
            mostrarMensagem(AlertType.ERROR, "Erro", e.getMessage());
        }

    }

    private void limparListaSolicitacoes() {
        txtNome.clear();
        txtCPF.clear();
        txtApolice.clear();
        txtEnderecoAcidente.clear();
    }

    public void atualizarListaSolicitacoes() {
        lista.getItems().clear();
        
        try {
            dao.buscarTodos().forEach(cliente -> lista.getItems().add(cliente));
        } catch (SQLException e) {
            mostrarMensagem(AlertType.ERROR, "ERRO", e.getMessage());
        }
    }

    private void mostrarMensagem(AlertType tipo, String titulo, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(mensagem);
        alert.show();
    }

    public void cancelarChamado(){
        var guincho = lista.getSelectionModel().getSelectedItem();
        try {
            dao.cancelarChamado(guincho);
            atualizarListaSolicitacoes();
        } catch (SQLException e) {
            mostrarMensagem(AlertType.ERROR, "Erro", e.getMessage());
            
        }
    }

}
