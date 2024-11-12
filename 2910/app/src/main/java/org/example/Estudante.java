package org.example;

public class Estudante {
    private String nome;
    private double notaFinal;
    private int faltas;
    private static int totalEstudantes = 0;

    public Estudante(String nome, double notas, int faltas) {
        this.nome = nome;
        this.notaFinal = notas;
        this.faltas = faltas;

        totalEstudantes++;

    }

    public static int getTotalEstudantes() {
        return totalEstudantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notas) {
        this.notaFinal = notas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String toString() {
        return "Estudante [nome=" + nome + ", notaFinal=" + notaFinal + ", faltas=" + faltas + "]";
    }

}
