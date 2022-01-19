package Aula02;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas macas deseja comprar?");
        int macas = leitor.nextInt();

        double preco;
        if (macas < 12){
            preco = 1.30 * macas;
        }
        else{
            preco = 1.00 * macas;
        }
        System.out.printf("O preco a ser pago e R$ %.2f", preco);
    }
}