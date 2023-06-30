package Zajecia8;
import java.util.concurrent.atomic.AtomicInteger;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        Thread watek = new Thread() { // podobnie jak poprzednio, obiekt reprezentujący nowy wątek
            @Override
            public void run() {
                dodajWartosc(); // kod do wykonania dla nowego wątku
            }
        };

        watek.start(); // startujemy drugi wątek
        dodajWartosc(); // wątek 1 wywołuje też tę metodę

        Thread.sleep(2000L); // czekaj 2 sekundy
        System.out.println(WARTOSC_ATOMOWA.get()); // wyświetl wartość int z obiektu atomowego AtomicInteger
    }

    // ten int powinien być obiektem Atomic - atomowy jeśli ma z niego korzystac kilka wątków, inaczej
    // jest ryzyko że niepoprawnie będą przypisywane jego nowe wartości - nowe wątki nie będą ich widziały/będą widziały co innego
    public static volatile Integer WARTOSC = 0;

    public static final AtomicInteger WARTOSC_ATOMOWA = new AtomicInteger(0);

    public static void dodajWartosc() {
        for (int i = 0; i < 100; i++) {
            WARTOSC_ATOMOWA.incrementAndGet(); // co iterację dodaj 1 do inta z obiektu AtomicInteger
        }
    }
}