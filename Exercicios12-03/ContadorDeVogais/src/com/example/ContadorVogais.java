package com.example;

public class ContadorVogais {
    public static int contarVogais(String palavra) {
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char ch = Character.toLowerCase(palavra.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
