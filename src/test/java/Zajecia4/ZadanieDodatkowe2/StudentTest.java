package Zajecia4.ZadanieDodatkowe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testEquals() {
        //given
        Student annSze = new Student("Anna", "Szewczyk");
        Student annSze1 = new Student("Anna", "Szewczyk"); // takie same wartości pol: imię i nazwisko
        Student annBed = new Student("Anna", "Bednarska");
        //when
        boolean b = annSze.getFirstName().equals(annSze1.getFirstName()) && annSze.getSecondName().equals(annSze1.getSecondName());
        boolean c = annSze1.getFirstName().equals(annBed.getFirstName()) && annSze1.getSecondName().equals(annBed.getSecondName());
        //then
        assertEquals(annSze,annSze1);
        assertTrue(b);
        assertFalse(c);

    }

    @Test
    void testHashCode() {
        //given
        Student annSze = new Student("Anna", "Szewczyk");
        Student annSze1 = new Student("Anna", "Szewczyk"); // takie same wartości pol: imię i nazwisko
        Student annBed = new Student("Anna", "Bednarska");
        //when
        int i = annSze.getFirstName().hashCode() + annSze.getSecondName().hashCode();
        int j = annSze1.getFirstName().hashCode() + annSze1.getSecondName().hashCode();
        int k = annBed.getFirstName().hashCode() + annBed.getSecondName().hashCode();
        //then
        assertTrue(i==j);
        assertFalse(i==k);


    }
}