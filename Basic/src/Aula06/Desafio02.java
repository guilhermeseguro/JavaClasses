package Aula06;

import java.util.Locale;

public class Desafio02 {
    public static void main(String[] args) {
        System.out.println(palindromo("Ama"));
    }

    public static String palindromo(String palavra){

        palavra = palavra.toLowerCase(Locale.ROOT);
        int tamanho = palavra.length();
        char[] vetorLetras = new char[tamanho];
        char[] vetorLetrasInvertidas = new char[tamanho];

        for (int i = 0; i < tamanho; i++){
            vetorLetras[i] = palavra.charAt(i);
            vetorLetrasInvertidas[i] = palavra.charAt(tamanho-i-1);
        }

        String saida1 = new String(vetorLetras);
        String saida2 = new String(vetorLetrasInvertidas);
        String mensagem = "";

        if (saida1.equals(saida2)){
            mensagem = "A palavra é palindromo";
        }
        else{
            mensagem = "A palavra NÃO é palindromo";
        }
        return mensagem;
    }

}
