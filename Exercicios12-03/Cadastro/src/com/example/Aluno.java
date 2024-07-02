package com.example;

class Aluno {

    String nome;
    int idade;

    Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.printf("Aluno: %s%n\n", this.nome);
        System.out.printf("Idade: %d%n\n", this.idade);

    }

}
