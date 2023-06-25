package Zajecia4.ZadanieDodatkowe2;

public class Student {

    private String firstName;
    private String secondName;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student() {
    }

    public void showInfo() {
        System.out.println(String.format("Student name: %s %s ", this.firstName + this.secondName));
    }

    public boolean equals(Object obj) { // działa, gdy porownuje pola dwoch obiektow, bedacych osobnymi instalcjami, nie działa dodajac do listy wykorzystajac contains

        if (obj instanceof Student) {
            Student student1 = (Student) obj;
            if (this.firstName.equals(student1.firstName) && this.secondName.equals(student1.secondName))
                return true;
        }
        return false;
    }

    public int hashCode() { // działa, gdy porownuje pola dwoch obiektow, bedacych osobnymi instalcjami
        return this.firstName.hashCode() + this.secondName.hashCode();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

}
