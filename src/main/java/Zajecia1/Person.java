package Zajecia1;
//Klasa Person
//
//        Zaimplementuj klasę abstrakcyjną Person. Klasa powinna zawierać:
//        * dwa pola typu String: name, address
//        * konstruktor bezparametrowy ustawiający wartość pól name i address na pusty String
//        * konstruktor z dwoma parametrami: String name, String address
//        * metody typu getter odpowiedzialne za zwracanie wartości zmiennej: name, address
//        * metody typu setter odpowiedzialne za ustawianie wartości pól name, address
//        * metoda abstrakcyjna showDetails

public abstract class Person {

    private String name;
    private String adress;


    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public Person() {
        this.name = "";
        this.adress = "";
    }


    abstract void showDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
