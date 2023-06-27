package Zajecia4.ZadanieDodatkowe2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testEquals() {
        //given
        Student annSze = new Student("Anna", "Szewczyk");
        Student annBed = new Student("Anna", "Bednarska");
        Student lukSow = new Student("Lukasz", "Sowa");
        School first = new School(new HashMap<>());
        School second = new School(new HashMap<>());
        School third = new School(new HashMap<>());

        first.getSchool().put("1a", new Clazz(List.of(annBed, annSze, lukSow)));
        second.getSchool().put("1a", new Clazz(List.of(annBed, annSze, lukSow)));

        //when
        boolean b = first.getSchool().values().size() == second.getSchool().values().size();
        boolean c = first.getSchool().values().size() == third.getSchool().values().size();
        //then
        assertTrue(b);

    }

    @Test
    void testHashCode() {
        //given
        Student annSze = new Student("Anna", "Szewczyk");
        Student annBed = new Student("Anna", "Bednarska");
        Student lukSow = new Student("Lukasz", "Sowa");
        School first = new School(new HashMap<>());
        School second = new School(new HashMap<>());

        first.getSchool().put("1a", new Clazz("1a",List.of(annBed, annSze, lukSow)));
        second.getSchool().put("1a", new Clazz("1a",List.of(annBed, annSze, lukSow)));
        //when
        boolean b = first.hashCode() == second.hashCode();
        //then
        assertTrue(b);

    }

}