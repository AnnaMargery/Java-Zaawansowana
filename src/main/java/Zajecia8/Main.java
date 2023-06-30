package Zajecia8;
public class Main {

    public static void main(String[] args) {
        Thread watek = new Thread() { // tworzę instancję klasy Thread
            @Override
            public void run() { // nadpisuję metodę która ma w sobie kod który będzie wykonywał nowy wątek
                printNazwa(); // drugi wątek wywoła metodę niżej
            }
        };

        watek.start(); // wątek pierwszy startuje drugi wątek
        printNazwa(); // i sam wywołuje te metodę niżej
    }

    public static synchronized void printNazwa() { // metoda synchronizowana, tzn. tylko max 1 wątek może ją wykonywać
        for (int i = 0; i < 10; i++) { // pętla, 10 iteracji
            System.out.println("Wartość: " + i + " wątek: " + Thread.currentThread().getName()); // wypisz liczbe i nazwę wątku wykonywującego linijkę
            try {
                Thread.sleep(1000L); // poczekaj po tym 1 sekundę
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}