package Zajecia2.ZadanieDodatkowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarenheitTest {

    @Test
    void toCelsius() {
        //given
        double tempInFarenheit = 33d;
        double expected = 0.5556d;
        //when
        double converted = (tempInFarenheit - 32d) * 0.5556d;
        //then
        assertEquals(expected, converted);
    }

    @Test
    void toKelvin() {
        //given
        double tempInFarenheit = 0d;
        double expected = 255.37222222222223;
        //when
        double converted = (tempInFarenheit + 459.67d) * (5d / 9d);
        //then
        assertEquals(expected, converted);
    }

    @Test
    void toFarenheit() {
    }
}