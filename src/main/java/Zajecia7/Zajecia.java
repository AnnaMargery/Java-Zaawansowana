package Zajecia7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Zajecia {

    public static void main(String[] args) throws IOException {

        Path sciezka = Path.of("/Users/erafalko/priv/wit/src/main/resources/plik");
        Files.createFile(sciezka);
        Files.writeString(sciezka, "ta linijka znajdzie się w pliku", StandardOpenOption.WRITE);
        Files.readAllLines(sciezka).forEach(System.out::println);


    }
}

//
//import java.util.*;
//
//    public class Main {
//
//        public static final int MAX_ATTEMPTS = 5;
//
//        private final String pole = "test";
//
//        public Main() {
//
//        }
//
//        public final void testowaMetoda() {
//
//        }
//
//        public static void main(String[] args) {
//            ArrayList<String> a;
//            LinkedList<String> b;
//            HashSet<String> c;
//            HashMap<String, Integer> d;
//            LinkedHashMap<String, Integer> e;
//            TreeMap<String, Integer> f;
//
//            String string1 = "test";
//            string1 = "test2";
//            string1 = "test";
//
//            string1 = string1.replace("t", "e");
//            System.out.println(string1);
//
//
//            MojString moja = new MojString("jakiś tekst w środku");
//            moja.replace("ś", "xyz");
//            System.out.println(moja);
//
//            Testowy t = new Testowy("", 1);
//
//            Samochod s = new Samochod("", 1);
//            var zmiennaVar = 1;
//            var zmienna2 = new Samochod(", 1", 1);
//
//            for (var x : List.of("", "", "")) {
//
//            }
//        }


