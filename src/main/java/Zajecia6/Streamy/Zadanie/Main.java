package Zajecia6.Streamy.Zadanie;
//Korzystając z Stream API, napisz funkcję, która dla poniższego przykładu:
//
//
// List<Movie> movies = Arrays.asList(….)
// gdzie Movie to klasa
//class Movie {
//    String title;
//    String type;
//    long duration; //min
//    LocalDate releaseDate
//}
//
//    zwróci listę filmów, gdzie:
//        - długość filmu będzie większa niż 20 min
//        - rok wydania nie będzie starszy niż 2018
//        - typ to horror

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        List<Movie> movies = Arrays.asList( new Movie("La soupe a choux", "Comedie", 124L, LocalDate.of(1981, 6, 12)),
                                            new Movie("Le petit baigneur", "Comedie", 260L, LocalDate.of(1999, 7, 11)),
                                            new Movie("Les rivières pourpres", "horror", 200L, LocalDate.of(2000, 3, 24)),
                                            new Movie("Seven", "horror",190L,LocalDate.of(2017,2,9)));

        List<Movie> movies1 = selectMovies(movies);
        System.out.println(movies1.size());


    }

    public static List<Movie> selectMovies (List<Movie> list){

        List<Movie> result = list.stream()
                .filter(durationTime -> durationTime.getDuration() > 20L)
                .filter(releaseDate -> releaseDate.getReleaseDate().isBefore(LocalDate.of(2018,01,01)))
                .filter(type -> type.getType().equals("horror")).toList();

        return result;
    }



}
