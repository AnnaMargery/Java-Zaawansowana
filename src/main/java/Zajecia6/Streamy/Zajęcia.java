package Zajecia6.Streamy;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Zajęcia {

    public static void main(String[] args) {
        List<String> dane = List.of("slowo1", "dłuższe słowo", "xyz 12355");

        long wynik = dane.stream() // otwarcie streamu
                .filter(arg0 -> arg0.contains(" ")) // przechodzą elementy ze spacją
                .peek(System.out::println) // wypisujemy element w konsoli
                .map(element -> element.replace("ł", "")) // mapowanie (konwersja) na Stirng bez ł
                .peek(System.out::println) // wypisujemy w konsoli
                .count(); // zliczamy ile elementów doszło do tego kroku - 2

        List<Integer> listaIntegerow = List.of("123", "12345", "-12332").stream()
                .map(Integer::parseInt) // lista Stringów, elementy mapujemy na int
                .toList(); // ładujemy je wszystkie do nowej listy

        Integer max = Stream.of(1, 2, 3, 4, 5).max(Comparator.naturalOrder()).orElse(0); // Stream z intami, szukamy największego inta, Comparator porównuje po kolei wartości, jak nie ma to Optional zwróci 0

        String najkrotszy = dane.stream().min(Comparator.comparingInt(String::length)).get(); // najkrótszy String, Comparator porównuje Stringi na podstawie ich długości, zwracamy wynik w tym null jeśli nie znaleziono

        dane.stream().map(String::length).min(Comparator.naturalOrder()).get(); // zwracamy int reprezentujący długość najkrótszego słowa, nie słowo

        String b = Set.of("element1", "xyz", "element2", "xyyyz").stream()
                .filter(a -> a.startsWith("e")).findFirst().get(); // filtrujemy przepuszczając elementy które zaczynają się od e, znajdujemy pierwszy lepszy element, zwracamy go

        List<String> posortowane = dane.stream().sorted().toList(); // sortujemy elementy
        List<String> posortowane2 = dane.stream().sorted(Comparator.reverseOrder()).toList(); // sortujemy odwrotnie, w przypadku Stringów sortowanie będzie polegało na alfabecie

        IntStream.range(0, 10).filter(i -> i % 3 == 0).forEach(System.out::println); // Stream z nastawieniem na liczby, na int, filtrujemy wartości, wypisujemy je w konsoli

        int suma = List.of("1", "2", "3").stream().mapToInt(a -> Integer.parseInt(a)).sum(); // Stream który konwertuje listę String na IntStream i sumuje liczby
        List.of(1, 2, 3).stream().mapToInt(Integer::intValue).sum(); // jak wyżej ale mamy startowo Stream Integerów który zamieniamy na IntStream
    }
}