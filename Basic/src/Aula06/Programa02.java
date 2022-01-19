package Aula06;

public class Programa02 {
    public static void main(String[] args) {

        System.out.println("O retorno e " + sinal(13));

    }
    public static int sinal(int numero){
        int retorno = 1;

        if (numero % 2 == 1) retorno = -1;

        return retorno;

    }
}
