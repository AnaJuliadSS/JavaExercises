package com.example;

public class Banda {
    private String nome;
    private int anoFormacao;
    private int numeroIntegrantes;

    public Banda(String nome, int anoFormacao, int numeroIntegrantes) {
        this.nome = nome;
        this.anoFormacao = anoFormacao;
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(int anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public void exibirDetalhes() {
        System.out.println("Nome da banda: " + nome);
        System.out.println("Ano de formação: " + anoFormacao);
        System.out.println("Número de integrantes: " + numeroIntegrantes);
    }
}
