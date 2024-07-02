package main.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SorteioNomes {
    
    public void sorteiaNomes()
    {
        Scanner scannerSorteio = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        System.out.println("Quantos nomes você deseja inserir para realizar o sorteio?");
        int quantidadeNomes = scannerSorteio.nextInt();
        scannerSorteio.nextLine();

        System.out.println("Insira os nomes:");
        for (int i = 0; i < quantidadeNomes; i++) {
            String nome = scannerSorteio.nextLine();
            listaNomes.add(nome);
        }

        Random random = new Random();
        int indiceSorteado = random.nextInt(listaNomes.size());
        String nomeSorteado = listaNomes.get(indiceSorteado);

        System.out.println("O nome sorteado é: " + nomeSorteado);
    }
}
