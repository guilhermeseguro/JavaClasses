package Aula01.Exercicios;

public class Exercicio8 {
    public static void main(String[] args) {
        double distanciaKm = 15;
        double tempoMin    = 50.5;
        double distanciaMi = distanciaKm/1.6;
        double tempoHoras  = tempoMin/60;
        double velocidadeMedia = distanciaMi/tempoHoras;

        System.out.printf("Vel media = %.3f mi/h", velocidadeMedia);

    }
}
