package Zajecia6.ZadanieNaZajeciach;

//Na podstawie listy List<Integer> napisz metodę, który zwróci tylko elementy unikalne, przykładowy input:
//        List<Integer> values = new ArrayList<>();
//        values.add(10);
//        values.add(11);
//        values.add(10);
//        values.add(11);
//        values.add(12);
//        values.add(11);

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        System.out.println(withoutDuplicates(values));
        System.out.println(withoutDuplicates2(values));

    }

    public static List<Integer> withoutDuplicates(List<Integer> listToCheck) {

        for (int i = 0; i < listToCheck.size(); i++) {
            for (int j = i + 1; j < listToCheck.size(); j++) {
                if (listToCheck.get(i) == listToCheck.get(j)) {
                    listToCheck.remove(j);
                }
            }
        }
        return listToCheck;
    }

    public static List<Integer> withoutDuplicates2 (List<Integer> listToCheck){

        List<Integer> output = new ArrayList<>();
        for (Integer element : listToCheck) {
            if(!output.contains(element)) output.add(element);
        }
        return output;
    }



}
