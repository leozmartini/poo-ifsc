package org.example;

public class Carro {
    private double velocidadeAtual = 0;
    private final double VELOCIDADE_MAXIMA;
    private String MODELO;
    private double aceleracao;

    public Carro(double velocidadeAtual, double velocidadeMaxima, String modelo, double aceleracao) {
        this.acelerar(velocidadeAtual);
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.MODELO = modelo;
        this.aceleracao = aceleracao;

    }

    public void acelerar(double v) {
        this.velocidadeAtual = Math.max(Math.min(this.velocidadeAtual + v, VELOCIDADE_MAXIMA), 0);
    }

    public void frear(double v) {
        this.velocidadeAtual = Math.min(Math.max(this.velocidadeAtual - v, 0), VELOCIDADE_MAXIMA);

    }

    // getters e setters
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String modelo) {
        this.MODELO = modelo;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

}
