package DesafiosHandsOn.ConversorTemperatura;

public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 16;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + "º em Celsius é igual a: " + temperaturaFahrenheit + "º Fahrenheit.\n");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + "º Fahrenheit é igual a " + temperaturaCelsius + "º Celsius.");
    }
}
