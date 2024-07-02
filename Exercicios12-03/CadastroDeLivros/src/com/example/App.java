package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Livro");
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano do livro:");
        int ano = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, ano);

        System.out.println("Detalhes do livro cadastrado:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano: " + livro.getAno());

        scanner.close();
    }
}
