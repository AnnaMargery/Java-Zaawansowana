package Zajecia4.Zadanie_konwersja;
//Napisz mechanizm, który skonwertuje listę typu String na listę typu Integer.

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        List<String> stringList =  new ArrayList<>();

        stringList.add("-7653");
        stringList.add("87348");
        stringList.add("53437");

        List<Integer> integerList = convert(stringList);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

    public static List<Integer> convert(List<String> toConvert) {

        List<Integer> converted = new ArrayList<>();
        for (String o : toConvert) {
            converted.add(parseInt(o));
        }
        return converted;
    }


}
