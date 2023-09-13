package com.example.model;


public class LocalDoAcidente {

    MotoristaDoGuincho motorista = new MotoristaDoGuincho();

    private String endereco;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String estado) {
        this.endereco = estado;
    }

    public void informacoesLocalDoAcidente() {
        System.out.println("Local do acidente: " + 
                            "/n Endereco: " + getEndereco());
    }   
}
