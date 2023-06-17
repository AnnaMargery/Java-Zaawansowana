package Zajecia2.ZadanieDodatkowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelvinTest {

    @Test
    void toCelsius() {
        //given
        double tempInKelvin = 273.15d;
        double expected = 0d;
        //when
        double converted = tempInKelvin - 273.15d;
        //then
        assertEquals(expected, converted);
    }

    @Test
    void toFarenheit() {
        //given
        double tempInKelvin = 0d;
        double expected = -459.67d;
        //when
        double converted = tempInKelvin * 9d / 5d - 459.67d;
        //then
        assertEquals(expected, converted);

    }

    @Test
    void toKelvin() {
    }
}