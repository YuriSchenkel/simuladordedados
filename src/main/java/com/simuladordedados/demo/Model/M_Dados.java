package com.simuladordedados.demo.Model;


public class M_Dados {
    private int soma;
    private int maximo;
    private int[] vetResultado;

    public M_Dados(int soma, int maximo, int[] vetResultado){
        this.soma = soma;
        this.maximo = maximo;
        this.vetResultado = vetResultado;
    }

    public int getSoma() {
        return soma;
    }

    public int getMaximo() {
        return maximo;
    }

    public int[] getVetResultado() {
        return vetResultado;
    }

}
