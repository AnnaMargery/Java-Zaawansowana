package Zajecia5.Exception;

//Napisz metodę, który skonwertuje listę typu String na listę typu Integer. Tym razem przygotuj się na każdy możliwy input i wartości Stringów listy.
//        Dwa warianty:
//        - zignoruj niepoprawne Stringi
//        - w przypadku niepoprawnego wyrzuć własny Exception

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("-7653");
        stringList.add("87348");
        stringList.add("vf5");
        stringList.add("53437");
        stringList.add("abc");
        stringList.add("?");


        List<Integer> integerList2 = convert2(stringList);
        for (Integer integer : integerList2) {
            System.out.println(integer);
        }
        try {
            List<Integer> intList2 = convert2(stringList);
            for (Integer integer : integerList2) {
                System.out.println(integer);
            }
        } catch (OneOfElementsIsNotANumber e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> convert(List<String> toConvert) { // metoda ignoruje niepoprawne strngi,

        if (toConvert == null) throw new IllegalArgumentException("Podany argunment jest nullem");
        List<Integer> converted = new ArrayList<>();

        for (String o : toConvert) {
            try {
                converted.add(parseInt(o));
            } catch (NumberFormatException e) {
            }
        }
        return converted;
    }

    public static List<Integer> convert2(List<String> stringList) {
        List<Integer> converted = new ArrayList<>();

        try {
            for (String o : stringList) {
                converted.add(parseInt(o));
            }
        } catch (NumberFormatException exception) {
            throw new OneOfElementsIsNotANumber();
        }
        return converted;
    }
}

//import java.util.ArrayList;
//        import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        convert1(null);
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("234");
//        stringList.add("-5");
//        stringList.add("89");
//        stringList.add("1e-10");
//        stringList.add("-2000000");
//
//        List<Integer> intList1 = convert1(stringList);
//        for (Integer item : intList1) {
//            System.out.print(item + ", ");;
//        }
//        System.out.println();
//
//        try {
//            List<Integer> intList2 = convert2(stringList);
//            for (Integer item : intList2) {
//                System.out.print(item + ", ");;
//            }
//        }
//        catch (OneOfElementsIsNotANumberException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<Integer> convert1(List<String> stringList) {
//        if (stringList == null) throw new IllegalArgumentException("Given argument is null.");
//        List<Integer> intList = new ArrayList<>();
//
//        for (String item : stringList) {
//            try {
//                intList.add(Integer.parseInt(item));
//            }
//            catch (NumberFormatException exception) {}
//        }
//
//        return intList;
//    }
//
//    public static List<Integer> convert2(List<String> stringList) {
//        List<Integer> intList = new ArrayList<>();
//
//        try {
//            for (String item : stringList) {
//                intList.add(Integer.parseInt(item));
//            }
//        }
//        catch (NumberFormatException exception) {
//            throw new OneOfElementsIsNotANumberException();
//        }
//
//        return intList;
//    }
//}