package Zajecia4.ZadanieDodatkowe2;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println(annSze.equals(annSze1)); //true
        System.out.println(annSze1.equals(annSze)); //true

        System.out.println(annSze1.hashCode()); //annszew.hashCode= annsze1.hashCode
        System.out.println(annSze.hashCode());


        Clazz students1a = new Clazz("1a",new ArrayList<>());

        students1a.getStudents().add(annSze);
        students1a.getStudents().add(annBed);
        students1a.getStudents().add(matZan);
        students1a.getStudents().add(annKow);
        students1a.getStudents().add(marKro);
        students1a.getStudents().add(robSad);
        students1a.getStudents().add(lukSow);
        students1a.getStudents().add(zofRob);
//        students1a.getStudents().add(annSze1);// dodaje duplikat- metoda contains nie wykrywa że osoba o takim imieniu i nazwisku juz widnieje.
        students1a.showInfo();
        System.out.println();


        //tworze klase blizniacza do poprzedniej, aby sprawdzic funkcjonowanie metod equals i hash code.
        Clazz students2a = new Clazz("2a", new ArrayList<>());

        students2a.getStudents().add(annSze);
        students2a.getStudents().add(annBed);
        students2a.getStudents().add(matZan);
        students2a.getStudents().add(annKow);
        students2a.getStudents().add(marKro);
        students2a.getStudents().add(robSad);
        students2a.getStudents().add(lukSow);
        students2a.getStudents().add(zofRob);
//         students2a.getStudents().add(annSze1);//nie dziala sprawdzanie indentycznych wartosci pol dla proby dodania ucznia o takich samych danych

        System.out.println(students1a.equals(students2a)); // equals zwraca true
        System.out.println(students2a.equals(students1a)); // equals zwraca true
        System.out.println(students1a.equals(students1a)); // equals zwraca true

        System.out.println((students1a.hashCode() == students2a.hashCode())); //hashCode zwraca true
        System.out.println(students1a.hashCode());
        System.out.println(students2a.hashCode());

        System.out.println(students1a.getStudents().size()); //false
        System.out.println(students2a.getStudents().size());

        System.out.println(students1a.getClassName());
        System.out.println(students2a.getClassName());
    }

}

