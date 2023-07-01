package Zajecia6.ZadanieDodatkowe;

import java.util.Comparator;
import java.util.List;

public class Strings {

    public static void main(String[] args) {

        List<String> listOfStrings = List.of("pies", "kot", "komputer", "Ania", "Java", "jezyk Java", "kawa", "kawa z mlekiem", "Kawa", "test", "test jednostkowy", "kawa i java");

//        getAlphabeticalOrder(listOfStrings);
//        System.out.println();
//        getNumberOfWordAppearance(listOfStrings);
//        System.out.println();
        getFirstWordByLetter(listOfStrings);
    }

    // 4. Posortuj listę napisów alfabetycznie.
    public static List<String> getAlphabeticalOrder(List<String> listOfStrings) {
        return listOfStrings.stream().sorted(Comparator.naturalOrder()).peek(System.out::println).toList();
    }

    // 5. Zlicz liczbę wystąpień konkretnego napisu w liście napisów.
    public static int getNumberOfWordAppearance(List<String> listOfStrings) {
        return (int) listOfStrings.stream().filter(word -> word.toLowerCase().contains("kawa")).peek(System.out::println).count();
    }

    // 6. Znajdź średnią długość napisów w liście.


    // 9. Znajdź pierwszy napis, który zaczyna się od określonej litery w liście napisów.
    public static void getFirstWordByLetter(List<String> listOfStrings) {
        listOfStrings.stream().filter(word->word.startsWith("p")).peek(System.out::println);
    }

}


//
//
//Java 8 provides different utility api methods to help us sort the streams better.
//        If your list is a list of Integers(or Double, Long, String etc.,) then you can simply sort the list with default comparators provided by java.

//        List<Integer> integerList = Arrays.asList(1, 4, 3, 4, 5);

//        Creating comparator on fly:
//        integerList.stream().sorted((i1, i2) -> i1.compareTo(i2)).forEach(System.out::println);
//
//        With default comparator provided by java 8 when no argument passed to sorted():
//        integerList.stream().sorted().forEach(System.out::println); //Natural order
//
//        If you want to sort the same list in reverse order:
//        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // Reverse Order
//
//        If your list is a list of user defined objects, then:
//        List<Person> personList = Arrays.asList(new Person(1000, "First", 25, 30000),
//        new Person(2000, "Second", 30, 45000),
//        new Person(3000, "Third", 35, 25000));
//
//        Creating comparator on fly:
//        personList.stream().sorted((p1, p2) -> ((Long)p1.getPersonId()).compareTo(p2.getPersonId()))
//        .forEach(person -> System.out.println(person.getName()));
//
//        Using Comparator.comparingLong() method(We have comparingDouble(), comparingInt() methods too):
//        personList.stream().sorted(Comparator.comparingLong(Person::getPersonId)).forEach(person -> System.out.println(person.getName()));
//
//        Using Comparator.comparing() method(Generic method which compares based on the getter method provided):
//        personList.stream().sorted(Comparator.comparing(Person::getPersonId)).forEach(person -> System.out.println(person.getName()));
//
//        We can do chaining too using thenComparing() method:
//        personList.stream().sorted(Comparator.comparing(Person::getPersonId).thenComparing(Person::getAge)).forEach(person -> System.out.println(person.getName())); //Sorting by person id and then by age.
//
//        Person class
//
//public class Person {
//    private long personId;
//    private String name;
//    private int age;
//    private double salary;
//
//    public long getPersonId() {
//        return personId;
//    }
//
//    public void setPersonId(long personId) {
//        this.personId = personId;
//    }
//
//    public Person(long personId, String name, int age, double salary) {
//        this.personId = personId;
//        this.name = name;
//        this.age = age;
//
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}

