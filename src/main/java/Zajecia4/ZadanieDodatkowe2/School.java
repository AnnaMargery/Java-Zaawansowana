package Zajecia4.ZadanieDodatkowe2;

import java.util.Map;
import java.util.Objects;

public class School {

    private Map<String, Clazz> school;

    public School(Map<String, Clazz> school) {
        this.school = school;
    }

    public Map<String, Clazz> getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object o) {      // ilosc klas, ilosc uczniow.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return Objects.equals(school, school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school);
    }
}
