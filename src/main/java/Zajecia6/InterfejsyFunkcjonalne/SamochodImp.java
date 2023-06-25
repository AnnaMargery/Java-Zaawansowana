package Zajecia6.InterfejsyFunkcjonalne;

public class SamochodImp implements Samochod {
    @Override
    public int jedz(int arg0, int predkosc) {
        return arg0/predkosc;
    }
}