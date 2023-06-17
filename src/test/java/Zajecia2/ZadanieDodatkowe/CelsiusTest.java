package Zajecia2.ZadanieDodatkowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusTest {

    @Test
    void toKelvin() {
        //given
        double tempInCelsius = 0d;
        double expected = 273.15d;
        //when
        double converted = tempInCelsius + 273.15d;
        //then
        assertEquals(expected,converted);
    }

    @Test
    void toFarenheit() {
        //given
        double tempInCelsius = 0d;
        double expected = 32.0d;
        //when
        double converted = (tempInCelsius * 1.8d) + 32.0d;
        //then
        assertEquals(expected,converted);

    }

    @Test
    void toCelsius() {
    }
}