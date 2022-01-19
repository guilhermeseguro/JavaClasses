package Aula01.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        float nota1 = 6.5f , peso1 = 2;
        float nota2 = 7.8f , peso2 = 2;
        float nota3 = 8.0f , peso3 = 3;
        float nota4 = 7.1f , peso4 = 3;
        float media = (nota1*peso1 + nota2*peso2 + nota3*peso3 + nota4*peso4)/(peso1 + peso2 + peso3 + peso4);
        // System.out.println(media);
        System.out.printf("media = %.2f", media);

    }
}
