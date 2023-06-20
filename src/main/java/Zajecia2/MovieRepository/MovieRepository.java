package Zajecia2.MovieRepository;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository extends Movie implements MovieRepositoryApi {

    private List<Movie> movies =  new ArrayList<>();


    @Override
    public void add(Movie movieToAdd) {

//        Movie[] movies = {movieToAdd};
//        Movie[] newMovies = Arrays.copyOf(movies, movies.length + 1);
//        newMovies[movies.length-1] = movieToAdd;
//        Movie[] newMovies = new Movie[movies.size() +1];
//        for (int i = 0, j = 0; i < newMovies.length; i++) {
//                newMovies[j] = movies[i];
//                movies[newMovies.length] = movieToAdd;
//        }
        movies.add(movieToAdd);
    }

    @Override
    public void delete(Movie movieToDelete) {
//        Movie[] newMovies = new Movie[movies.length - 1];
//        for (int i = 0, j = 0; i < movies.length; i++) {
//            if (i != index) {
//                newMovies[j++] = movies[i];
//                movies[i] = newMovies[j];
//            }
//        }
        movies.remove(movieToDelete);
    }

    @Override
    public List<Movie> findAll() {
        return this.movies;
    }
    @Override
    public Movie findByTitle(String searchedTitle) {

        Movie searchedMovie = new Movie();
        for (Movie movie : movies) {
            if (movie.getTitle().equals(searchedTitle))
                searchedMovie = movie;
        }
        return searchedMovie;
    }

    @Override
    public void showMovieInfo() {
        int i = 0;
        for (Movie movie : movies ){
            i++;
            System.out.println(String.format("%d. Film name: %s , Date of release: %s",i,movie.getTitle(), movie.getYearOfRelease()));
        }
    }
}

//package SDA.interfaces;
//
//public class MovieRepository implements MovieRepositoryApi {
//
//    private final Movie[] movies;
//    private static final int maxCountOfMovies = 1000;
//    int counter;
//
//    public MovieRepository() {
//        this.movies = new Movie[maxCountOfMovies+1];
//        counter = 0;
//    }
//
//    public int getCounter() {
//        return counter;
//    }
//
//    @Override
//    public void add(Movie movie) {
//        if (counter < maxCountOfMovies) {
//            movies[counter++] = movie;
//        } else {
//            System.out.println("Movie not added, too many movies in repository.");
//        }
//    }
//
//    @Override
//    public void delete(int index) {
//        if (index > 0 && index <= counter) {
//            for (int i = index - 1; i < counter; i++) {
//                movies[i] = movies[i + 1];
//            }
//            counter--;
//        } else {
//            System.out.println("Movie not deleted, bad index.");
//        }
//    }
//
//    @Override
//    public Movie[] findAll() {
//        return this.movies;
//    }
//
//    @Override
//    public Movie findByTitle(String title) {
//        for (Movie movie : movies) {
//            if (movie.getTitle().equals(title)) {
//                return movie;
//            }
//        }
//        System.out.println("Movie not found.");
//        return null;
//    }
//
//    @Override
//    public void printAll() {
//        for (int i = 0; i < counter; i++) {
//            System.out.printf("%d. %s, %d%n", i+1, movies[i].getTitle(), movies[i].getYearOfRelease());
//        }
//        System.out.println();
//    }
//}