package Zajecia1;
//
//        Klasa Lecturer
//
//        Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
//        * dwa pola: specjalizacja oraz wynagrodzenie
//        * konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
//        * metody typu getter dla zdeklarowanych pól
//        * metody typu setter dla zdeklarowanych pól
//        * metodę showDetails wyświetlającą szczegółowe informację o wykładowcy
//        Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
public class Lecturer extends Person{

    private String specjalizacja;
    private double wynagrodzenie;

    public Lecturer(String name, String adress, String specjalizacja, double wynagrodzenie) {
        super(name, adress);
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }


    @Override
    void showDetails() {
        System.out.println(String.format("Imię i Nazwisko: %s, Adres: %s, Specjalizacja: %s, Wynagrodzenie: %f", super.getName(),super.getAdress(),specjalizacja,wynagrodzenie));
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
}
