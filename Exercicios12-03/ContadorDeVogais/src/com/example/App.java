package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de Vogais");
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        ContadorVogais contadorVogais = new ContadorVogais(); 

        int numeroVogais = contadorVogais.contarVogais(palavra);

        System.out.println("Número de vogais na palavra \"" + palavra + "\": " + numeroVogais);

        scanner.close();
    }
}
