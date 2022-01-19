package Aula03;

import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui seu primeiro numero ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite aqui seu segundo numero ");
        double numero2 = scan.nextDouble();
        System.out.println("Escolha a operacao: \n1 - Adicao \n2 - Subtracao \n3 - Multiplicacao \n4 - Divisao");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1 -> {
                double soma = numero1 + numero2;
                System.out.printf("A soma e %.2f", soma);
            }
            case 2 -> {
                double diferenca = numero1 - numero2;
                System.out.printf("A diferenca e %.2f", diferenca);
            }
            case 3 -> System.out.printf("O produto e %.2f", numero1 * numero2);
            case 4 -> {
                if (numero2 == 0) {
                    System.out.println("A divisao esta errada!");
                    break;
                }
                double quociente = numero1 / numero2;
                System.out.printf("A divisao e %.2f", quociente);
            }
            default -> System.out.println("Digite corretamente, por gentileza");
        }
    }
}
