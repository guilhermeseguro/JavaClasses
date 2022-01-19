package Aula05;

public class Programa04 {
    public static void main(String[] args) {
        double[] notas = {6.5, 7.5, 8.0, 9, 5.5};

        // Calculando a media
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        int tamanho = notas.length;
        double media = soma/tamanho;

        System.out.println("A media da turma e " + media);

        int cont = 0;
        for (double nota : notas){
            if (nota > media){
                cont++;
            }
        }

        System.out.println("A quantidade de notas acima da media e " + cont);

    }
}
