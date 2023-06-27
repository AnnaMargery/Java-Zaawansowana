package Zajecia4.ZadanieDodatkowe2;

import java.util.ArrayList;
import java.util.HashMap;

//Na podstawie struktury klas uczniów w szkolę napisz mechanizm, który zwróci wszystkich uczniów danej szkoły.
// Każda szkoła zawierać ma mapę klas szkolnych (klucz to nazwa klasy, wartość to obiekt Klasa),
// a każda klasa szkolna powinna zawierać listę uczniów.
// bonusowo - testy (np. że zwraca poprawnie listę wszystkich uczniów)
public class Main {
    public static void main(String[] args) {

        Student annSze = new Student("Anna", "Szewczyk");
        Student annSze1 = new Student("Anna", "Szewczyk"); // takie same wartości pol: imię i nazwisko
        Student annBed = new Student("Anna", "Bednarska");
        Student matZan = new Student("Mateusz", "Zabielski");
        Student annKow = new Student("Anna", "Kowalska");
        Student marKro = new Student("Maria", "Krolik");
        Student robSad = new Student("Robert", "Sadowski");
        Student lukSow = new Student("Lukasz", "Sowa");
        Student zofRob = new Student("Zofia", "Robak");

        Clazz students1a = new Clazz("1a", new ArrayList<>());
        addingStudentsTo1a(annSze, annSze1, annBed, matZan, annKow, marKro, robSad, lukSow, zofRob, students1a);

        Clazz students2a = new Clazz("2a", new ArrayList<>());
        addingStudentsTo2a(annSze, annSze1, annBed, matZan, annKow, marKro, robSad, lukSow, zofRob, students2a);

        School school = new School(new HashMap<>());

        addingClassesToSchool(students1a, students2a, school);
        school.showStudents();


    }

    private static void addingClassesToSchool(Clazz students1a, Clazz students2a, School school) {
        school.getSchool().put("1a", students1a);
        school.getSchool().put("2a", students2a);
    }

    private static void addingStudentsTo2a(Student annSze, Student annSze1, Student annBed, Student matZan, Student annKow, Student marKro, Student robSad, Student lukSow, Student zofRob, Clazz students2a) {
        students2a.getStudents().add(annSze);
        students2a.getStudents().add(annBed);
        students2a.getStudents().add(matZan);
        students2a.getStudents().add(annKow);
        students2a.getStudents().add(marKro);
        students2a.getStudents().add(robSad);
        students2a.getStudents().add(lukSow);
        students2a.getStudents().add(zofRob);
    }

    private static void addingStudentsTo1a(Student annSze, Student annSze1, Student annBed, Student matZan, Student annKow, Student marKro, Student robSad, Student lukSow, Student zofRob, Clazz students1a) {
        students1a.getStudents().add(annSze);
        students1a.getStudents().add(annBed);
        students1a.getStudents().add(matZan);
        students1a.getStudents().add(annKow);
        students1a.getStudents().add(marKro);
        students1a.getStudents().add(robSad);
        students1a.getStudents().add(lukSow);
        students1a.getStudents().add(zofRob);
    }
}



