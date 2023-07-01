package Zajecia6.ZadanieDodatkowe;

import java.util.List;
import java.util.stream.Collectors;

public class Doubles {

    public static void main(String[] args) {


        List<Double> listOfDoubleNumbers = List.of(12.2d, 9.3d, -7.0d, 2.2d, 8.2d, 6.6d, 10.10d, -5.4d);

        getSumOfDoubles(listOfDoubleNumbers);
        getMultipliedByTwo(listOfDoubleNumbers);
    }

    // 2. Oblicz sumę wszystkich liczb z listy liczb zmiennoprzecinkowych.

    public static double getSumOfDoubles(List<Double> listOfDoubleNumbers) {

        return listOfDoubleNumbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    // 10. Przemnóż wszystkie liczby z listy liczb zmiennoprzecinkowych przez 2.

    public static void getMultipliedByTwo(List<Double> listOfDoubleNumbers) {

        listOfDoubleNumbers.stream().map(value -> value * 2).collect(Collectors.toList()).forEach(value -> System.out.println(value));
    }

}
