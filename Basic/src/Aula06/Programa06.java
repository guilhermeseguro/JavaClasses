package Aula06;

import java.util.Arrays;

public class Programa06 {
    public static void main(String[] args) {
        // int[] numeros = new int[] {1,2,3,4,5};
        // System.out.println("O vetor inicial e " + Arrays.toString(numeros));
        // int[] novo = novoVetor(numeros);
        // System.out.println("O vetor final e " + Arrays.toString(novo));

        String[] nomes = new String[] {"John", "Mary", "Bob"};
        System.out.println("O vetor inicial e " + Arrays.toString(nomes));
        String[] novosNomes = novoVetor(nomes);
        System.out.println("O vetor final e " + Arrays.toString(novosNomes));

    }

/*    public static int[] novoVetor(int[] vetor){

        int dimensao = vetor.length;
        int[] novoVetor = new int[dimensao];

        for (int i = 1; i <= dimensao; i++){
            novoVetor[i-1] = vetor[dimensao-i];
        }
        return novoVetor;
    }*/

    public static String[] novoVetor(String[] vetor){

        int dimensao = vetor.length;
        String[] novoVetor = new String[dimensao];

        for (int i = 1; i <= dimensao; i++){
            novoVetor[i-1] = vetor[dimensao-i];
        }
        return novoVetor;
    }

}
