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

//            if (!students.get(0).equals(students.get(students.size())))
//                this.students.add(studentToAdd);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return className.equals(clazz.className) && students.equals(clazz.students);
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

