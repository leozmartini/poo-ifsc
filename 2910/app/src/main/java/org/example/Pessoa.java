package org.example;

public class Pessoa {
    private String nome;
    private String cpf;
    // private int dataNascimento;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
