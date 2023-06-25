package Zajecia4.ZadanieDodatkowe2;

import java.util.ArrayList;
import java.util.List;

public class Clazz {

    private String className;
    private List<Student> students = new ArrayList<>();

    public Clazz(List<Student> students) {
        this.students = students;
    }

    public Clazz(String className, List<Student> students) {
        this.students = students;
        this.className = className;
    }

    public void add(Student studentToAdd) {

        if (studentToAdd == null) throw new NullPointerException("Podany obiekt jest nullem");

        if (!this.students.contains(studentToAdd)) this.students.add(studentToAdd);
//                for (Student student : this.students) {
//            if (student.hashCode() != studentToAdd.hashCode())
//                this.students.add(studentToAdd);
//    }
    }

    public void delete(Student studentToDelete) {

        if (studentToDelete == null) throw new NullPointerException("Podany obiekt jest nullem");
        if (this.students.contains(studentToDelete)) this.students.remove(studentToDelete);
    }

    public void showInfo() {

        System.out.println(String.format("Class name: %s , number of students: %d%n Students in class: ", this.className, this.students.size()));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.printf("%d. %s %s%n", i + 1, student.getFirstName(), student.getSecondName());
        }
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Clazz) {
            Clazz aClazz = (Clazz) obj;
            Clazz a1Clazz = (Clazz) obj;

            if (a1Clazz.getClassName().equals(aClazz.getClassName()) && a1Clazz.getStudents().size() == aClazz.getStudents().size()) ;
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return this.className.hashCode() + this.students.size();
    }

    public String getClassName() {
        return className;
    }

    public List<Student> getStudents() {
        return students;
    }
}

