package Zajecia2.MovieRepository;

import java.util.List;

public interface MovieRepositoryApi {

    void add(Movie movie);
    void delete(Movie movieToDelete);
    List<Movie> findAll();
    Movie findByTitle(String title);
    void showMovieInfo();


}
