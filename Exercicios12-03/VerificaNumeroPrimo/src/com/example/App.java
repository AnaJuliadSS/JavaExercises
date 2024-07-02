package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Número Primo");
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        VerificaPrimo verificaPrimo = new VerificaPrimo(); 
        if (verificaPrimo.verificarPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}

