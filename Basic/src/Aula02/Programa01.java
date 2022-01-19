package Aula02;

import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui a primeira parcela: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite aqui a segunda parcela: ");
        double n2 = scanner.nextDouble();
        double soma = n1 + n2;
        double diferenca = n1 - n2;
        System.out.printf("\nA soma e = %.2f", soma);
        System.out.printf("\nA diferenca e = %.2f", diferenca);
    }
}
