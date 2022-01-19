package Aula02;

import java.util.Scanner;

public class Programa05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salario atual: ");
        double salario = scanner.nextDouble();
        System.out.println("Taxa de reajuste (em %): ");
        double taxa = scanner.nextDouble();
        double salarioNovo = salario + salario*(taxa/100);
        // salario += salario*(taxa/100);
        System.out.printf("O novo salario e de %.2f", salarioNovo);
    }
}
