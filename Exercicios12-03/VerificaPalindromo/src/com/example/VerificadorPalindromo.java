package com.example;

public class VerificadorPalindromo {
    public static boolean verificaPalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

}
