package Aula01.Exercicios;

public class Desafio {
    public static void main(String[] args) {
        float a = 2.0f , b = 2.0f , c = 6.0f;
        double Delta = Math.pow(b,2) - 4*a*c;
        if (Delta >= 0) {
            double x1 = (-b - Math.sqrt(Delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(Delta)) / (2 * a);
            System.out.printf("\nx1 = %.2f", x1);
            System.out.printf("\nx2 = %.2f", x2);
        }
        else{
            System.out.println("Nao existem raizes reais.");
        }
    }
}

/*    public static void main(String[] args) {
        float a = 2.0f , b = 2.0f , c = 6.0f;
        double Delta = Math.pow(b,2) - 4*a*c;
        if (Delta < 0) {
            System.out.println("Nao existem raizes reais.");
            return;
        }

        double x1 = (-b - Math.sqrt(Delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(Delta)) / (2 * a);
        System.out.printf("\nx1 = %.2f", x1);
        System.out.printf("\nx2 = %.2f", x2);

    }
*/