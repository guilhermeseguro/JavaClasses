package Aula04;

import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args) {
        System.out.println("Digite um numero N:");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        for (int i = 1; i<= numero; i++){
            System.out.printf(i + " ");
        }


    }
}
