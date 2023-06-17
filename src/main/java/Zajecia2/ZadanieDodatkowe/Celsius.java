package Zajecia2.ZadanieDodatkowe;

public class Celsius extends Temperature implements UnitConverter {
    public Celsius(String name, double value) {
        super("Celsius", value);

    }

    public Celsius(double value) {
        super(value);
    }

    @Override
    public double toKelvin() {

        double converted = super.value + 273.15d;
        System.out.println(converted);

        return converted;
    }

    @Override
    public double toFarenheit() {

        double converted = (super.value * 1.8d) + 32.0d;
        System.out.println(converted);

        return converted;
    }

    @Override
    public double toCelsius() {

        System.out.println(super.value);

        return super.value;
    }


}

