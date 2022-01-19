package Aula06;

public class Programa04 {
    public static void main(String[] args) {
        System.out.println("A area do circulo e " + areaCirculo(1));

    }

    public static double areaCirculo(double raio){
        double area = Math.PI*Math.pow(raio,2);

        return area;
    }
}
