package Aula02;

import java.util.Scanner;

public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui o nome da pesssoa");
        String nome = scanner.nextLine();
        System.out.println("Digite aqui a idade da pesssoa");
        int idade = scanner.nextInt();
        System.out.println(nome + " tem " + idade + " anos.");
        // System.out.printf("\n%s tem %d anos.", nome, idade);
    }
}
