package Aula05;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Programa02 {
    public static void main(String[] args) {
        int tamanho = 20;
        int[] vetor = new int[tamanho];

        for (int i=0; i<tamanho; i++){
            int r = (int) (100*Math.random()); //(upper - lower)) + lower;
            vetor[i] = r; // como preencher aleatoriamente?
        }
        System.out.println(Arrays.toString(vetor));


        int soma = 0;
        for (int i = 0; i< tamanho; i++){
            if (vetor[i] %2 == 0){
                soma = soma + vetor[i];
            }
        }
        System.out.println("A soma das entradas pares é: " + soma);

    }
}
