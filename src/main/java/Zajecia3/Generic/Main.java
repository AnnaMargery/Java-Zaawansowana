package Zajecia3.Generic;

import java.time.LocalDate;

//Napisz klasę Pair, która będzie przyjmować dwa typy generyczne:
//        * typ first
//        * typ second
//
//        Zaimplementuj metody:
//        * first() -> która zwróci nam wartość first
//        * second() -> która zwróci nam wartość second
public class Main {
    public static void main(String[] args) {

        Pair<String,Integer> exampleMix = new Pair("Anna", 38);
        System.out.println(exampleMix.first());
        System.out.println(exampleMix.second());
        System.out.println();

        Pair<Integer,Integer> exampleStr = new Pair(24,03);
        System.out.println(exampleStr.first());
        System.out.println(exampleStr.second());
        System.out.println();

        Pair<LocalDate, LocalDate> exampleDate = new Pair(LocalDate.now(),LocalDate.now());
        System.out.println(exampleDate.first());
        System.out.println(exampleDate.second());
        System.out.println();

        Pair<String,String> exampleStrings = new Pair<>("I'm an example", "of a generic type");
        System.out.println(exampleStrings.first() + " " + exampleStrings.second());
        System.out.println();

    }
}
