package com.example.data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Cliente;

public class ClienteDAO {
    
    final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    // final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    final String USER = "rm552537";
    final String PASS = "280305";

    public void inserir(Cliente cliente) throws SQLException {

        var conexao = DriverManager.getConnection(URL, USER, PASS);

        var sql = "INSERT INTO cliente (nome, cpf, apolice, enderecoAcidente) VALUES (?, ?, ?, ?) ";
        var comando = conexao.prepareStatement(sql);
        comando.setString(1, cliente.nome());
        comando.setString(2, cliente.cpf());
        comando.setInt(3, cliente.apolice());
        comando.setString(4, cliente.enderecoAcidente());
        comando.executeUpdate();

        conexao.close();

    }

    public List<Cliente> buscarTodos() throws SQLException {
        var cliente = new ArrayList<Cliente>();
        var conexao = DriverManager.getConnection(URL, USER, PASS);
        var rs = conexao.createStatement().executeQuery("SELECT * FROM cliente ORDER BY nome");

        while (rs.next()) {
            cliente.add(new Cliente(
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getInt("apolice"),
                rs.getString("enderecoAcidente")));
        }

        conexao.close();
        return cliente;

    }

    public void cancelarChamado(Cliente cliente) throws SQLException {
        var con = DriverManager.getConnection(URL, USER, PASS);
        var stm = con.prepareStatement("DELETE FROM cliente WHERE apolice=?");
        stm.setInt(1, cliente.apolice() );
        stm.executeUpdate();
        con.close();
    }

}
