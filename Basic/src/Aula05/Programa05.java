package Aula05;

public class Programa05 {
    public static void main(String[] args) {
        int[] tabs = {545, 5665, 65, 76, 12, 65};

        int min = tabs[0] , max = tabs[0];
        for (int tab : tabs){
            if (tab < min){
                min = tab;
            }
            if (tab > max){
                max = tab;
            }
        }
        System.out.println("O minimo e " + min + " e o maximo e " + max);

    }
}
