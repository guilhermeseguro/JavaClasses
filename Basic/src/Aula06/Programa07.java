package Aula06;

import javax.swing.text.html.parser.ParserDelegator;

public class Programa07 {
    public static void main(String[] args) {
        String resultado1 = PadLeft(4, '-', "123");
        System.out.println("O resultado e " + resultado1);

        String resultado2 = PadRight(4, '-', "123");
        System.out.println("O resultado e " + resultado2);
    }

    public static String PadLeft(int pad, char element, String value) {

        int tamanho = value.length();
        int repeticao = pad - tamanho;
        char[] novoVetor = new char[repeticao];

        for (int i = 0; i < repeticao; i++) {
                novoVetor[i] = element;
        }
        String novo = new String(novoVetor);

        novo = novo + value;

        return novo;
    }

    public static String PadRight(int pad, char element, String value) {

        int tamanho = value.length();
        int repeticao = pad - tamanho;
        char[] novoVetor = new char[repeticao];

        for (int i = 0; i < repeticao; i++) {
            novoVetor[i] = element;
        }
        String novo = new String(novoVetor);

        novo = value + novo;

        return novo;
    }



}
