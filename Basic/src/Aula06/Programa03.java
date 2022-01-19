package Aula06;

public class Programa03 {
    public static void main(String[] args) {
        System.out.println("A potencia e " + potencia(2,10));

    }
    public static double potencia(double base, int expoente){
        // double potencia = Math.pow(base,expoente) ;

        double potencia = 1;

        for (int i = 1; i <= expoente; i++){
            potencia = potencia*base;
        }

        return potencia;
    }
}
