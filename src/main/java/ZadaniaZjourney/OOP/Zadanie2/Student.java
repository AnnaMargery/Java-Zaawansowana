package ZadaniaZjourney.OOP.Zadanie2;

public class Student extends Person{

    private String typeOfStudies;
    private int yearOfStudy;
    private float studiesCost;

    public Student(String name, String address, String typeOfStudies, int yearOfStudy, float studiesCost) {
        super(name, address);
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudy = yearOfStudy;
        this.studiesCost = studiesCost;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public float getStudiesCost() {
        return studiesCost;
    }

    public void setStudiesCost(float studiesCost) {
        this.studiesCost = studiesCost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() + '\'' +
                "address=" + super.getAddress() + '\'' +
                "typeOfStudies=" + typeOfStudies + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studiesCost=" + studiesCost +
                '}';
    }
}
