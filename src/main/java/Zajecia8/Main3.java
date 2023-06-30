package Zajecia8;

import java.util.concurrent.*;

public class Main3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor(); // tworzę 1 wątek przy Executors API
        service.submit(() -> System.out.println("test")).get(); // zlecam zadanie dla wątku i czekam aż się ono wykona
        service.submit(() -> System.out.println("test2")); // zlecam drugie zadanie, nie czekam, wątek idzie dalej
        service.submit(() -> { // od razu zleca kolejne
            int a = 5;
            a = a + 5;
        });

        Future<String> wynik = service.submit(() -> { // zlecam zadanie pobierając obiekt który reprezentuje zlecenie
            Thread.sleep(4000L);
            return "xyz"; // to zadanie zwraca wynik
        });

        while (!wynik.isDone()) { // sprawdzam czy zadanie jest wykonane, jeśli nie pętla się kręci
            System.out.println("trwa ładownie...");
            Thread.sleep(1000L);
        }

        System.out.println(wynik.get()); // pobieram wynik zleconego zadania, skoro ta linijka
        // się wykonała to znaczy ze petla skonczyła się kręcić i wynik jest gotowy

        ExecutorService service2 = Executors.newFixedThreadPool(10); // 10 wątków w 1 obiekcie ExecutorService z Executors API

        ScheduledExecutorService service3 = Executors.newSingleThreadScheduledExecutor(); // obiekt reprezentujący wątek w którym możemy zlecać zadania na później/cykliczne
        service3.schedule(() -> System.out.println("udało się"), 5000, TimeUnit.MILLISECONDS); // po 5 sekundach wykonaj ten kod
        service3.scheduleAtFixedRate(() -> System.out.println("stałe zadanie"), 1, 4, TimeUnit.SECONDS); // po sekundzie wykonaj kod a potem co 4 powtarzaj

        service.shutdown(); // zamknij ten wątek
        service2.shutdown(); // zamknij ten wątek
    }
}