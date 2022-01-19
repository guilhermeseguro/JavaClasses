package Aula02;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite aqui um número inteiro: ");
        int numero = scanner.nextInt(); // colocar um if de mensagem de saida caso nao digite inteiro
        int antecessor = numero - 1;
        System.out.printf("O antecessor desse numero e: %d", antecessor);
    }
}
