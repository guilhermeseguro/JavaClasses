package Aula05;

public class Programa06 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 12}, {3, 4}};

        int cont = 0;
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (ints[j] > 10) {
                    cont++;
                }
            }
        }
        System.out.println("A mmatriz possui " + cont + " valores maiores que 10");
    }
}
