package Aula04;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        System.out.println("Digite o numero do fatorial");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number < 0){
            System.out.println("Nao existe fatorial de numero negativo");
            return;
        }

        int fatorial = 1;
        for (int i = 1; i<= number; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
