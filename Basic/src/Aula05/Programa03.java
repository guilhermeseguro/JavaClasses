package Aula05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        String[] nomes = {"Luana", "Guilherme", "Vanessa"};
        List<String> nomes2 = Arrays.asList("Luana", "Guilherme", "Vanessa");

        System.out.println("Digite um nome:");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

/*
        boolean contem = false;

        for (String nome : nomes) {
            if (input.equalsIgnoreCase(nome)) {
                contem = true;
                break;
            }
        }
        String msg = contem
                ? "O nome esta no array"
                : "O nome nao esta no array";
        System.out.println(msg);
*/

        if (nomes2.contains(input)){
            System.out.println("O nome esta no array");
        }
        else{
            System.out.println("O nome nao esta no array");
        }
    }
}
