package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de Caracteres");
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        ContadorCaracteres contadorCaracteres = new ContadorCaracteres(); 
        int numeroCaracteres = contadorCaracteres.contarCaracteres(frase);

        System.out.println("Número de caracteres na frase: " + numeroCaracteres);

        scanner.close();
    }
}
