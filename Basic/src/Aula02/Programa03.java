package Aula02;

import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do retangulo: "); // if caso digite um número menor ou igual a zero
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura do retangulo: "); // if caso digite um número menor ou igual a zero
        double altura = scanner.nextDouble();
        double area = base*altura;
        System.out.printf("A area do retangulo e igual %.2f", area);

    }
}
