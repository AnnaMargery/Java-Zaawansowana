package Zajecia2.ZadanieDodatkowe;

public class Kelvin extends Temperature implements UnitConverter {

    public Kelvin(String name, double value) {
        super(name, value);
        this.name = "Kelvin";
    }

    public Kelvin(double value) {
        super(value);
    }

    @Override
    public double toCelsius() {

        double converted = super.value - 273.15d;
        System.out.println(converted);

        return converted;
    }

    @Override
    public double toFarenheit() {

        double converted = super.value * 9d / 5d - 459.67d;
        System.out.println(converted);

        return converted;
    }

    @Override
    public double toKelvin() {

        System.out.println(super.value);

        return super.value;
    }

}
