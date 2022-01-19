package Aula02;

import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do meliante: ");
        int idade = scanner.nextInt();
        System.out.println("A pessoa e estudante? (s/n)");
        // String estudante = scanner.next();
        boolean estudante = scanner.next().equalsIgnoreCase("s");

        if (idade > 65 || (estudante && idade < 21)){
            System.out.println("Esta liberado");
        }
        else{
            System.out.println("Se fodeu!");
        }
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite sua idade: ");
//        int idade = sc.nextInt();

//        System.out.println("Você é estudante? [S/N] ");
//        boolean estudante = sc.next().equalsIgnoreCase("S");

//        String msg = ((idade < 21 || idade > 65) || estudante)
//                ? "Paga meia-entrada"
//                : "Paga entrada inteira";

//        System.out.println(msg);
//    }