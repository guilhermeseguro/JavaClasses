package Aula01.Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        float raio = 6.5f;
        float perimetro = (float) (2 * Math.PI * raio);
        float area = (float) (Math.PI*Math.pow(raio,2));
        System.out.printf("\nperimetro = %.3f", perimetro);
        System.out.printf("\narea = %.3f", area);
    }
}
