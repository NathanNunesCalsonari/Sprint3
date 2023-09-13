package com.example.model;

public class Atendente {

    public String nomeAtendente;
    public int idAtendente;

    public String getNomeAtendente() {
        return nomeAtendente;
    }
    public void setNomeAtendente(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }
    public int getIdAtendente() {
        return idAtendente;
    }
    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public void registrarAtendente() {
        setNomeAtendente("João");
        setIdAtendente(522);
    }

    public void coletarInformacoesAtendente() {
        System.out.println("O Atendente " + getNomeAtendente() + " com o id " + getIdAtendente() + " fará o atendimento ");
    }

}
