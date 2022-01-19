package Aula06;

import java.util.Locale;

public class Desafio01 {
    public static void main(String[] args) {
        System.out.println("o numero de vogais e " + numeroVogais("Amora E uma fruta"));
        // nao funciona com letras maiusculas nem acentos
    }

    public static int numeroVogais(String palavra) {

        palavra = palavra.toLowerCase(Locale.ROOT);
        int tamanho = palavra.length();
        char[] vetorLetras = new char[tamanho];
        int vogais = 0;

        for (int i = 0; i < tamanho; i++) {
            vetorLetras[i] = palavra.charAt(i);
        }

        for (int i = 0; i < tamanho; i++) {
            if (vetorLetras[i] == 'a' || vetorLetras[i] == 'e' || vetorLetras[i] == 'i' || vetorLetras[i] == 'o' || vetorLetras[i] == 'u') {
                vogais += 1;
            }
        }
        return vogais;
    }
}