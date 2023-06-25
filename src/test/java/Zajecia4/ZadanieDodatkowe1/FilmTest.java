package Zajecia4.ZadanieDodatkowe1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void testHashCode() {
        //given
        Film film1 = new Film("La soupe a choux", "Jean Girault", 1981);
        Film film2 = new Film("La soupe a choux", "Jean Girault", 1981);
        //when
        int number1Film = film1.getTitle().hashCode() + film1.getMovieDirector().hashCode() + film1.getYearOfRelease();
        int number2Film = film2.getTitle().hashCode() + film2.getMovieDirector().hashCode() + film2.getYearOfRelease();
        //then
        assertEquals(number1Film,number2Film);
    }

    @Test
    void testEquals() {
        //given
        Film film1 = new Film("La soupe a choux", "Jean Girault", 1981);
        Film film2 = new Film("La soupe a choux", "Jean Girault", 1981);
        Film film3 = new Film("La soupe a choux", "Jean Girault", 2023);
        boolean equalsExpected = film1.equals(film2);
        boolean falseEXpected = film1.equals(film3);
        //when
        boolean areF1EqualsF2= film1.getTitle().equals(film2.getTitle()) && film1.getMovieDirector().equals(film2.getMovieDirector())
       && film1.getYearOfRelease().equals(film2.getYearOfRelease());
        boolean areF1EqualsF3= film1.getTitle().equals(film3.getTitle()) && film1.getMovieDirector().equals(film3.getMovieDirector())
       && film1.getYearOfRelease().equals(film3.getYearOfRelease());
        //then
        assertEquals(equalsExpected,areF1EqualsF2);
        assertNotEquals(falseEXpected,areF1EqualsF3);



    }
}