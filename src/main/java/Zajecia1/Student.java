package Zajecia1;
//        Klasa Student
//
//        Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
//        * trzy pola: typ studiów, rok studiów, koszt studiów
//        * konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
//        * metody typu getter dla zdeklarowanych pól
//        * metody typu setter dla zdeklarowanych pól
//        * metoda showDetails wyświetlająca szczegółowe informacje o studencie
public class Student extends Person {

    private String typStudiow;
    private String rokStudiow;
    private double kosztStudiow;

    public Student(String name, String adress, String typStudiow, String rokStudiow, double kosztStudiow) {
        super(name, adress);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    void showDetails() {
        System.out.println(String.format("Imię i nazwisko: %s, Adres: %s, Typ studiów: %s, Rok studiów: %s, Koszt studiów: %f ",super.getName(), super.getAdress(),typStudiow,rokStudiow,kosztStudiow));
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public String getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(String rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public double getKosztStudiow() {
        return kosztStudiow;
    }

    public void setKosztStudiow(double kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }
}
