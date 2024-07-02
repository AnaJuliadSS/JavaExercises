package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1. Calcular Média");
            System.out.println("2. Encontrar Maior Número");
            System.out.println("3. Sortear Nomes");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    CalcMedia calcMedia = new CalcMedia();
                    calcMedia.calculaMedia();
                    break;
                case 2:
                    EncontraMaiorNumero encontraMaiorNumero = new EncontraMaiorNumero();
                    encontraMaiorNumero.encontraMaiorNumero();
                    break;
                case 3:
                    SorteioNomes sorteioNomes = new SorteioNomes();
                    sorteioNomes.sorteiaNomes();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        
    }
}
