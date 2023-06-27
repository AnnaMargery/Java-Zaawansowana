package Zajecia4.ZadanieDodatkowe2;

import java.util.Map;
import java.util.Objects;

public class School {

    private Map<String, Clazz> school;

    public School(Map<String, Clazz> school) {
        this.school = school;
    }


    public School() {
    }

    public Map<String, Clazz> getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;

        return Objects.equals(school.values().size(), school1.school.values().size());
    }

    @Override
    public int hashCode() {
        return Objects.hash(school);
    }
    
    
    public void showStudents(){

        for (Map.Entry<String, Clazz> entry : school.entrySet()) {
            System.out.println("Class name: " + entry.getKey() + " Students: " + entry.getValue().getStudents().toString());
        }
    }
}
