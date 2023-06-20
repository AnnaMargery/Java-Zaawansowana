package Zajecia2.MovieRepository;

public class Main {

    public static void main(String[] args) {

        MovieRepository moviesFrancais = new MovieRepository();

        moviesFrancais.add(new Movie("La soupe a choux", 1981));
        moviesFrancais.add(new Movie("Le petit baigneur", 1968));
        moviesFrancais.add(new Movie("Bienvenue chez les Ch'tis", 2008));
        moviesFrancais.add(new Movie("Les Visiteurs", 1993));
        moviesFrancais.add(new Movie("Les rivières pourpres", 2000));
        moviesFrancais.add(new Movie("Poszukiwany-Poszukiwana", 1972));

        moviesFrancais.showMovieInfo();
        System.out.println();
        moviesFrancais.delete(moviesFrancais.findByTitle("Poszukiwany-Poszukiwana"));
        moviesFrancais.showMovieInfo();

    }
}
