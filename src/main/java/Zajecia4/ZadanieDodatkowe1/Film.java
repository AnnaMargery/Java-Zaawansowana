package Zajecia4.ZadanieDodatkowe1;

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
public class Film {

    private String title;
    private String movieDirector;
    private Integer yearOfRelease;

    public Film(String title, String movieDirector, int yearOfRelease) {
        this.title = title;
        this.movieDirector = movieDirector;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + this.movieDirector.hashCode() + this.yearOfRelease.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Film film1 = (Film) obj;
        Film film2 = (Film) obj;
        return film1.getTitle().equals(film2.getTitle()) && film1.getMovieDirector().equals(film2.getMovieDirector()) && film1.getYearOfRelease() == film2.getYearOfRelease();

    }

//    @Override
//    public boolean equals(Object obj) {
//        Film film1 = (Film) obj;
//
//        return this.title.equals(film1.getTitle()) && this.movieDirector.equals(film1.getMovieDirector()) && this.yearOfRelease == film1.getYearOfRelease();
//
//    }

    public String getTitle() {
        return title;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

}
