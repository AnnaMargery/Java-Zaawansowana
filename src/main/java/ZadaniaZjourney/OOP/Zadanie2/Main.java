package ZadaniaZjourney.OOP.Zadanie2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        Person student = new Student("John", "Washington 34/3", "IT", 3, 5000f);
        Person staff = new Staff("Anna", "Chigago 34/3", "IT", 1000f);
        System.out.println(staff);
        System.out.println(student);

    }

}
