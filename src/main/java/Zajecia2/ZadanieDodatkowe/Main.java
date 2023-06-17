package Zajecia2.ZadanieDodatkowe;

public class Main {
    public static void main(String[] args) {

    Temperature celsius = new Celsius(30d);
    celsius.toFarenheit();
    celsius.toKelvin();
    celsius.toCelsius();

    Temperature farenheit = new Farenheit(50d);
    farenheit.toCelsius();
    farenheit.toKelvin();
    farenheit.toFarenheit();

    Temperature kelvin = new Kelvin(300d);
    kelvin.toCelsius();
    kelvin.toFarenheit();
    kelvin.toKelvin();








    }
}
