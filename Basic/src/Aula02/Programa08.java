package Aula02;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        double n = scanner.nextDouble();

        if (n >= 0){
            System.out.println("O numero e positivo");
        }
        else{
            System.out.println("O numero e negativo");
        }
    }
}
