package Aula05;

public class Programa07 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][15];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 || j == 0 || i == matriz.length - 1 || j == matriz[0].length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
