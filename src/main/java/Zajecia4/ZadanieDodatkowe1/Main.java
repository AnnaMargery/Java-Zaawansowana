package Zajecia4.ZadanieDodatkowe1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Przygotuj klasę o następujących polach:
//        - title (String)
//        - reżyser (String)
//        - rok wydania (int)
//
//        Dodaj dwa jednakowe obiekty (dwie różne instancje ta sama zawartość pól) do dowolnej listy i HashSetu:
//        * najpierw bez implementacji metody hashCode i metody Equals
//        * z implementacją metody equals
//        * z implemenetacją metody hashCode
//        Zaobserwuj różnicę (sprawdzaj liczbę elementów przed i po dodaniu).
//
//        Dla powyższej listy liczba duplikatów powinna być równa: 2
public class Main {

    public static void main(String[] args) {


        Film film1 = new Film("La soupe a choux", "Jean Girault", 1981);
        Film film2 = new Film("La soupe a choux", "Jean Girault", 1981);

        List<Film> films = new ArrayList<>();

        films.add(film1);
        films.add(film2);
        System.out.println("Without implementations of equals and hashCode - before: ArrayList -> " + films.size());
        films.clear();

        //Lista metoda equals
        if (film1.equals(film2)) System.out.println("Array List- quals: Filmy są takie same");
        else {
            System.out.println("Array List - Equals: Filmy są rozne");
            films.add(film1);
            films.add(film2);
        }
        System.out.println("With implementations of equals - after: ArrayList -> " + films.size());
        films.clear();

        //Lista metoda hasCode
        if (film1.hashCode() == film2.hashCode()) System.out.println("HashCode: Filmy są takie same");
        else {
            System.out.println("Array List- HashCode: Filmy są rozne");
            films.add(film1);
            films.add(film2);
        }
        System.out.println("With implementations of hashCode - after: ArrayList -> " + films.size());
        films.clear();
        System.out.println();

        Set<Film> fewFilms = new HashSet<>();

        fewFilms.add(film1);
        fewFilms.add(film2);
        System.out.println("Without implementations of equals and hashCode - before: HashSet -> " + fewFilms.size());
        fewFilms.clear();

        //HashSet metoda equals
        if (film1.equals(film2)) {
            System.out.println("Equals: Filmy są takie same");
            fewFilms.add(film1);
        } else {
            System.out.println("HashSet- Equals: Filmy są rozne");
            fewFilms.add(film1);
            fewFilms.add(film2);
        }
        System.out.println("With implementations of equals - after: HashSet-> " + fewFilms.size());
        fewFilms.clear();

        //HashSet metoda hasCode
        if (film1.hashCode() == film2.hashCode()) {
            System.out.println("HashSet: Filmy są takie same");
            fewFilms.add(film1);
        } else {
            System.out.println("HashSet: Filmy są rozne");
            fewFilms.add(film1);
            fewFilms.add(film2);
        }
        System.out.println("With implementations of equals and hashCode - after: HashSet-> " + fewFilms.size());

    }
}
