package Aula02;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui a retarded unit: ");
        double tempF = scanner.nextDouble();
        double tempC = 5*(tempF - 32)/9;
        System.out.printf("A temperatura em non retarded unit é %.2f", tempC);
    }
}
