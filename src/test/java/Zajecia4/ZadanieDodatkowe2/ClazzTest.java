package Zajecia4.ZadanieDodatkowe2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClazzTest {

//    @Test
//    void whenGivenAStudent_thenAddToTheClazz() {
//        //given
//        Student annSze = new Student("Anna", "Szewczyk");
//        Student annSze1 = new Student("Anna", "Szewczyk"); // takie same wartości pol: imię i nazwisko
//        Student annBed = new Student("Anna", "Bednarska");
//        Student empty = new Student(null, null);
//        //when
////        students1a.getStudents().add(annSze);
////        students1a.getStudents().add(annSze1);
////        students1a.getStudents().add(annBed);
////        students1a.getStudents().add(empty);
//        //then
//
//
//    }

    private void assertThrowsExactly(boolean empty, NullPointerException e) {
    }

    @Test
    void delete() {





    }

    @Test
    void testEquals() {
        //given
        Student matZan = new Student("Mateusz", "Zabielski");
        Student annKow = new Student("Anna", "Kowalska");

        Clazz testClazz = new Clazz("5a",new ArrayList<Student>());
        testClazz.add(matZan);
        testClazz.add(annKow);
        Clazz test1Clazz = new Clazz("5a",new ArrayList<Student>());
        test1Clazz.add(matZan);
        test1Clazz.add(annKow);
        Clazz test3Clazz = new Clazz("1a",new ArrayList<Student>());
        test3Clazz.add(annKow);
        //when
        boolean b = testClazz.getClassName().equals(test1Clazz.getClassName()) && testClazz.getStudents().size() == test1Clazz.getStudents().size();
        boolean c = testClazz.getClassName().equals(test3Clazz.getClassName()) && testClazz.getStudents().size() == test3Clazz.getStudents().size();
        //then
        assertTrue(b);
        assertFalse(c);
    }

    @Test
    void testHashCode() {
        //given
        Student matZan = new Student("Mateusz", "Zabielski");
        Student annKow = new Student("Anna", "Kowalska");

        Clazz testClazz = new Clazz("5a",new ArrayList<Student>());
        testClazz.add(matZan);
        testClazz.add(annKow);
        Clazz test1Clazz = new Clazz("5a",new ArrayList<Student>());
        test1Clazz.add(matZan);
        test1Clazz.add(annKow);
        Clazz test3Clazz = new Clazz("1a",new ArrayList<Student>());
        test3Clazz.add(annKow);
        //when
        int b = testClazz.getClassName().hashCode() + testClazz.getStudents().hashCode();
        int i = test1Clazz.getClassName().hashCode() + test1Clazz.getStudents().hashCode();
        int c = test3Clazz.getClassName().hashCode()+ test3Clazz.getStudents().hashCode();
        //then
        assertEquals(b,i);
        assertNotEquals(i,c);






    }
}