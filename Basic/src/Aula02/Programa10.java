package Aula02;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano em que voce nasceu");
        int birthyear = scan.nextInt();

        int ano = LocalDate.now().getYear();

        if (ano - birthyear < 16){
            System.out.println("Nao pode votar");
        }
        else {
            System.out.println("Vote, mas nao no Bolsonaro");
        }
    }
}
