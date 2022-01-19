package Aula02;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O total de votos e: ");
        int total = scanner.nextInt();
        System.out.println("Votos brancos: ");
        int brancos = scanner.nextInt();
        System.out.println("Nulos: ");
        int nulos = scanner.nextInt();
        int validos = total - (brancos + nulos);
        double brancosPerc = 100*(brancos/(double)total);
        double nulosPerc = 100*(nulos/(double)total);
        double validosPerc = 100*(validos/(double)total);
        System.out.printf("\nPercentual de votos brancos e %.2f", brancosPerc);
        System.out.printf("\nPercentual de votos nulos e %.2f", nulosPerc);
        System.out.printf("\nPercentual de votos validos e %.2f", validosPerc);

    }
}
