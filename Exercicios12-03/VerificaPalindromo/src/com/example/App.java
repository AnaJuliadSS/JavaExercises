package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Palíndromo");
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        VerificadorPalindromo verificaPalindromo = new VerificadorPalindromo();
        
        if (VerificadorPalindromo.verificaPalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}
