package main.java;

import java.util.Scanner;

public class EncontraMaiorNumero {
    
    public void encontraMaiorNumero()
    {
        Scanner scannerMaior = new Scanner(System.in);
        
        System.out.println("Quantos números você deseja inserir para encontrar o maior numero?");
        int tamanhoArray =scannerMaior.nextInt();
        
        int[] numeros = new int[tamanhoArray];
        
        System.out.println("Insira os números:");
        for (int i = 0; i < tamanhoArray; i++) {
            numeros[i] = scannerMaior.nextInt();
        }
        
        int maior = numeros[0];
        for (int i = 1; i < tamanhoArray; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        System.out.println("O maior número é: " + maior);
        
    }
}
