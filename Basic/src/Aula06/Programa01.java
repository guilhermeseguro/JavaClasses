package Aula06;

public class Programa01 {
    public static void main(String[] args) {
        int valor = comparacao(10,0);
        System.out.println("O retorno e " + valor);
        //System.out.println("O retorno e " + comparacao(10,0));

        maior(10,10);
    }
    // A funcao deve estar fora do main e dentro da classe
    public static int comparacao(int numero1, int numero2){
        int retorno = 0;

        if (numero1 < numero2){
            retorno = -1;
        }
        else if (numero1 > numero2){
            retorno = 1;
        }
        return retorno;
    }
    public static void maior(int numero1, int numero2){
        //int maiorValor;

        if (numero1 < numero2){
            System.out.println(numero1 + " é menor do que " + numero2);
        }
        else if (numero1 == numero2){
            System.out.println("Os numeros sao iguais");
        }
        else {
            System.out.println(numero1 + " é maior do que " + numero2);
        }
    }
}
