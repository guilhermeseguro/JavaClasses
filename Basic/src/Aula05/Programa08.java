package Aula05;

public class Programa08 {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3]; // Cria a matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    matriz[i][j] = "x";
                } else {
                    matriz[i][j] = "o";
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
