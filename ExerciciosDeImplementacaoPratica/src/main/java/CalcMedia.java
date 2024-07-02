package main.java;

import java.util.Scanner;

public class CalcMedia {
    
    public void calculaMedia()
    {

        Scanner scannerMedia = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir para realizar o cálculo da média?");
        int quantidadeNumeros = scannerMedia.nextInt();

        int soma = 0;
        
        System.out.println("Insira os números:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scannerMedia.nextInt();
            soma += numero;
        }
        
        double media = (double) soma / quantidadeNumeros;
        
        System.out.println("A média dos números é: " + media);
        
    }

}
