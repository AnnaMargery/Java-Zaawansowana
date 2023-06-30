package Zajecia8.ZadanieNaZajeciach;

//Zaplanuj zadanie, które co sekundę sprawdzi zawartość jakiegoś pliku i czy jest ona równa "xyz".
// Bonus, jeśli jest równa xyz Thread (ExecutorService) powinien się zamknąć.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> {
            Path sciezka = Path.of("C:\\Projects\\SDA Training\\Java_Zaawansowana_teoria\\src\\main\\resources\\plik");
            try {
                if (Files.readAllLines(sciezka).get(0).equals("xyz")) {
                    System.out.println("jest xyz");
                    service.shutdown();
                } else System.out.println("nie ma xyz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, 1, 1, TimeUnit.SECONDS);

//ctrl +s zapisanie pliku z dysku.

    }
}
