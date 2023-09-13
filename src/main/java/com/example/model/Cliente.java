package com.example.model;

public record Cliente (String nome, String cpf, Integer apolice, String enderecoAcidente) {

    @Override
    public String toString(){
        return nome + ": " + cpf + " - " + apolice + " - " + enderecoAcidente;
    }
}