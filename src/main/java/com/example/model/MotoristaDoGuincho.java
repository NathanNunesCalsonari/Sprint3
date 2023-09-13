package com.example.model;

public class MotoristaDoGuincho {

    private String nomeMotoristaDoGuincho;
    private int idMotoristaDoGuincho;

    public String getNomeMotoristaDoGuincho() {
        return nomeMotoristaDoGuincho;
    }
    public void setNomeMotoristaDoGuincho(String nomeMotoristaDoGuincho) {
        this.nomeMotoristaDoGuincho = nomeMotoristaDoGuincho;
    }
    public int getIdMotoristaDoGuincho() {
        return idMotoristaDoGuincho;
    }
    public void setIdMotoristaDoGuincho(int idMotoristaDoGuincho) {
        this.idMotoristaDoGuincho = idMotoristaDoGuincho;
    }

    public void registrarMotorista() {
        setNomeMotoristaDoGuincho("Eduardo");
        setIdMotoristaDoGuincho(513);
    }

    public void coletarInformacoesMotorista() {
        System.out.println("O nome do motorista é " + getNomeMotoristaDoGuincho() + " e o seu id é " + getIdMotoristaDoGuincho());

    }

    
    
}
