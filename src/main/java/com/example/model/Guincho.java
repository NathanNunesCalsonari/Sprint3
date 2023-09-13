package com.example.model;

public class Guincho {
    private String funcaoDoGuincho;
    private int numeroDoGuincho;
    private double cargaSuportada;

    MotoristaDoGuincho motorista = new MotoristaDoGuincho();

    public String getFuncaoDoGuincho() {
        return funcaoDoGuincho;
    }
    public void setFuncaoDoGuincho(String funcaoDoGuincho) {
        this.funcaoDoGuincho = funcaoDoGuincho;
    }
    public int getNumeroDoGuincho() {
        return numeroDoGuincho;
    }
    public void setNumeroDoGuincho(int numeroDoGuincho) {
        this.numeroDoGuincho = numeroDoGuincho;
    }
    public double getCargaSuportada() {
        return cargaSuportada;
    }
    public void setCargaSuportada(double cargaSuportada) {
        this.cargaSuportada = cargaSuportada;
    }

    public void registrarGuincho() {
        setFuncaoDoGuincho("transportar veículos de porte grande");
        setCargaSuportada(70);
        setNumeroDoGuincho(300);
    }

    public void informacoesGuincho() {
        motorista.coletarInformacoesMotorista();
        System.out.println("A função do guincho é para " + getFuncaoDoGuincho() + ". Seu número é " + getNumeroDoGuincho() + "e suporta uma carga de " + getCargaSuportada());
    }

    
    
}
