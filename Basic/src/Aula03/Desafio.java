package Aula03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("Digite aqui a data do seu nascimento (dd/mm/aaaa)");
        Scanner scan = new Scanner(System.in);
        String data = scan.next();
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate novadata = LocalDate.parse(data,dTF);

        String signo = "";
        int dia = novadata.getDayOfMonth();

        switch (novadata.getMonthValue()){
            case 1:
                signo = (dia < 21) // condicao booleana
                        ? "Capricornio" // if
                        : "Aquario";    // else
                break;

            case 2: // modo alternativo
                if (dia < 20){
                    signo = "Aquario";
                }
                else {
                    signo = "Peixes";
                }
                break;

            case 3:
                signo = (dia <= 20)
                        ? "Peixes"
                        : "Aries";
                break;

            case 4:
                signo = (dia <= 20)
                        ? "Aries"
                        : "Touro";
                break;

            default:
                System.out.println("Digite uma data valida");
                break;
        }
        System.out.println("Seu signo e " + signo);
    }
}
