package Zajecia3.Enum_ContinentTask;

public enum Continent {
    
    AMERYKA(30.4d),
    AMERYKA_POLUDNIOWA(17.8d),
    AMERYKA_POLNOCNA(24.2d),
    ANTARKTYDA(13.2d),
    AUSTRALIA(7.7d),
    EUROPA(10.2d),
    AZJA(44.6d);

    private double area;

    Continent(double area) {
        this.area = area;
    }

    public static Continent getBiggestContinent() {

        Continent[] continents = Continent.values();
        Continent biggest = continents[0];

        for (int i = 0; i < continents.length; i++) {
            Continent continent = continents[i];
            if (biggest.area < continent.area)
                biggest = continent;
        }
        return biggest;
    }

    public static Continent getSmallestestContinent() {

        Continent[] continents = Continent.values();
        Continent smallest = continents[0];

        for (int i = 0; i < continents.length; i++) {
            Continent continent = continents[i];
            if (smallest.area > continent.area)
                smallest = continent;
        }
        return smallest;
    }

}
