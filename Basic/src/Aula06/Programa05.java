package Aula06;

public class Programa05 {
    public static void main(String[] args) {
        double novaTemperatura1 = celsiusToKelvin(0);
        System.out.println("A temperatura em K e " + novaTemperatura1);

        double novaTemperatura2 = celsiusToFahrenheit(0.1);
        System.out.println("A temperatura em F e " + novaTemperatura2);
    }
    public static double celsiusToKelvin(double temperature){
        return temperature - 273.0;
    }
    public static double celsiusToFahrenheit (double temperature){
        return 9.0*temperature/5.0 + 32.0;
    }
}
