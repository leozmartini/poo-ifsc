package org.example;

public class Carro {
    private String modelo;
    private String cor;
    private int velocidadeAtual;

    public void definirVelocidade(int v) {
        velocidadeAtual = v;
    }

    public int obterVelocidade() {
        return velocidadeAtual;
    }

    public void definirModelo(String m) {
        modelo = m;
    }

    public String obterModelo() {
        return modelo;
    }

    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor() {
        return cor;
    }

    public void listarAtributos() {
        System.out.println(modelo + " " + cor + " está " + velocidadeAtual + " km/h");
    }

}