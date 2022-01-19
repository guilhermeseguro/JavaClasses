package Aula05;

import java.util.Arrays;

public class Programa01 {
    public static void main(String[] args) {
        int[] impares = new int[10];

        for (int i=0; i<10; i++){
            impares[i] = 2*i + 1;
        }
        System.out.println(Arrays.toString(impares));
    }
}
