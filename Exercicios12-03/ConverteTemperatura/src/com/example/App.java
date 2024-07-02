package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int opcao = scanner.nextInt();

        Conversor conversor = new Conversor(); 
        
        switch (opcao) {
            case 1:
                System.out.println("Digite a temperatura em Cel1sius(utilize vírgula para números de ponto flutuante):");
                double temperaturaCelsius = scanner.nextDouble();
                double resultadoFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
                System.out.println("Temperatura em Fahrenheit: " + resultadoFahrenheit);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit(utilize vírgula para números de ponto flutuante):");
                double temperaturaFahrenheit = scanner.nextDouble();
                double resultadoCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
                System.out.println("Temperatura em Celsius: " + resultadoCelsius);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

