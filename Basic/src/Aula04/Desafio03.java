package Aula04;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        System.out.println("Digite o numero de termos desejado: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int termo1 = 1;
        int termo2 = 1;
        int termo3 = 0;

        System.out.println(termo1);
        System.out.println(termo2);

        for (int i = 3 ; i <= numero; i++){
            termo3 = termo1 + termo2;
            System.out.println(termo3);
            termo1 = termo2;
            termo2 = termo3;

        }
        // imprimir a sequencia (termo1, termo2, ... termos calculados ..., termo n)
    }
}
