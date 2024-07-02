package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Moedas");
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. Dólar para Real");
        System.out.println("2. Real para Dólar");

        ConversorMoedas conversorMoedas = new ConversorMoedas();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor em dólar:");
                double valorEmDolar = scanner.nextDouble();
                double resultadoReal = conversorMoedas.dolarParaReal(valorEmDolar);
                System.out.println("Valor em reais: R$" + resultadoReal);
                break;
            case 2:
                System.out.println("Digite o valor em reais:");
                double valorEmReal = scanner.nextDouble();
                double resultadoDolar = conversorMoedas.realParaDolar(valorEmReal);
                System.out.println("Valor em dólar: $" + resultadoDolar);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
