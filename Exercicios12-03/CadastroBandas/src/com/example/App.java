package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Bandas de Rock");
        System.out.println("Digite o nome da banda:");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano de formação da banda:");
        int anoFormacao = scanner.nextInt();

        System.out.println("Digite o número de integrantes da banda:");
        int numeroIntegrantes = scanner.nextInt();

        Banda banda = new Banda(nome, anoFormacao, numeroIntegrantes);
        System.out.println("Detalhes da banda cadastrada:");
        banda.exibirDetalhes();

        scanner.close();
    }
}
