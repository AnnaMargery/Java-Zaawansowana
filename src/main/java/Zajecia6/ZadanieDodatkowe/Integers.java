package Zajecia6.ZadanieDodatkowe;

import java.util.Comparator;
import java.util.List;

public class Integers {

    public static void main(String[] args) {

        List<Integer> listOfIntegerNumbers = List.of(12,2,3, 45, 11, 24, 9, -7, 2, 3,8, 13, 6, 10, -5);

        getEven(listOfIntegerNumbers); //ok
        System.out.println();
        getMaximum(listOfIntegerNumbers);
        System.out.println();
        getDistinct(listOfIntegerNumbers);
        System.out.println();
        getPositive(listOfIntegerNumbers);
        System.out.println();


    }
    // 1. Wybierz liczby parzyste z listy liczb całkowitych//
    public static void getEven(List<Integer> listOfIntegerNumbers) {

        listOfIntegerNumbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
    // 3. Znajdź największą liczbę w liście liczb całkowitych.
    public static void getMaximum(List<Integer> listOfIntegerNumbers) {

        listOfIntegerNumbers.stream().max(Comparator.naturalOrder()).orElse(0);
    }

    // 7. Wybierz unikalne liczby z listy liczb całkowitych.

    public static void getDistinct(List<Integer> listOfIntegerNumbers) {

        listOfIntegerNumbers.stream().distinct().forEach(System.out::println);
    }

    // 8. Odrzuć wszystkie liczby ujemne z listy liczb całkowitych.
    public static void getPositive(List<Integer> listOfIntegerNumbers) {

        listOfIntegerNumbers.stream().filter(number-> number>0).forEach(System.out::println);
    }


}
