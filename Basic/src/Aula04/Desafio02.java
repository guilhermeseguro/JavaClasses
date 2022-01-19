package Aula04;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        String msg = "O numero e primo";

        for (int i = 2; i <= numero/2 ; i++){
            if (numero%i == 0){
                msg = "O numero nao e primo";
                break;
            }
        }
        System.out.println(msg);
    }
}
