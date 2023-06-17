package Zajecia2.ZadanieDodatkowe;

public abstract class Temperature implements UnitConverter {

    String name;
    double value;

    public Temperature(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public Temperature(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

}
