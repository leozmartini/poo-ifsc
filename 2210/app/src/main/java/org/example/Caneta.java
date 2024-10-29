package org.example;

public class Caneta {
    private String cor;

    public void definirCor(String novaCor) {
        cor = novaCor;
    }

    public String desenhar(int distancia) {
        return "Desenhando uma linha " + cor + " de " + distancia + " cm";
    }

}