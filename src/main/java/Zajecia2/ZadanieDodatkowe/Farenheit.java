package Zajecia2.ZadanieDodatkowe;

public class Farenheit extends Temperature implements UnitConverter{

    public Farenheit(String name, double value) {
        super(name, value);
        this.name = "Farenheit";
    }

    public Farenheit(double value) {
        super(value);
    }

    @Override
    public double toCelsius() {

        double converted = (super.value - 32d) * 0.5556d;
        System.out.println(converted);

        return converted;
    }

    @Override
    public double toKelvin() {

        double converted = (super.value + 459.67d) * (5d/9d);
        System.out.println(converted);

        return converted;
    }

    @Override
    public double toFarenheit() {

        System.out.println(super.value);

        return super.value;
    }
}
