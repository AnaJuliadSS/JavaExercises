package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double num3 = scanner.nextDouble();

        Calculadora calculadora = new Calculadora();
        double media = calculadora.calculaMedia(num1, num2, num3);

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
