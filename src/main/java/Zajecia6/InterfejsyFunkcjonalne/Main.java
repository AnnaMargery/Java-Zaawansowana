package Zajecia6.InterfejsyFunkcjonalne;

public class Main {

    public static void main(String[] args) {
        Samochod samochod1 = new SamochodImp();

        Samochod samochod2 = new Samochod() {
            @Override
            public int jedz(int arg0, int arg1) {
                return arg0 / arg1;
            }
        };

        Samochod samochod3 = (arg0, prd) -> arg0 / prd;

        samochod1.jedz(1, 1);
        samochod2.jedz(1, 2);
        samochod3.jedz(3, 2);
    }
}

