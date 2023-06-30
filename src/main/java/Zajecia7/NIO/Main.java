package Zajecia7.NIO;

//Napisz metodę która przyjmuje argument String i każdy znak z argumentu zamienia na osobny plik w wybranym katalogu
// (np. resources) np. input cześć tworzy pliki c z e ś ć. W każdym z plików zapisz argument metody.

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.StandardOpenOption;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        Path sciezka = Path.of("/Users/erafalko/priv/wit/src/main/resources/plik");
//        Files.createFile(sciezka);
//        Files.writeString(sciezka, "ta linijka znajdzie się w pliku", StandardOpenOption.WRITE);
//        Files.readAllLines(sciezka).forEach(System.out::println);
//    }
//}


import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) throws IOException {

        getMessageIntoFiles("anna");
        getMessageIntoFiles("leon");

    }

    public static void getMessageIntoFiles(String message) throws IOException {

//         regex
         if(!message.matches("^[a-zA-Z0-9]+$")) throw new IllegalArgumentException();

//        char[] chars = message.toCharArray();
        for (String aChar : message.split("")) {
            Path source = Path.of("C:\\Projects\\SDA Training\\Java_Zaawansowana_teoria\\src\\main\\resources\\" +aChar+ ".txt");
            if(!Files.exists(source)) Files.createFile(source);
            try {
                Files.createFile(source);
            } catch (FileAlreadyExistsException e){}
            Files.writeString(source,"start write", StandardOpenOption.WRITE);
        }
    }
}

//    private static void convertCharToFile(String word) throws IOException{
//        for (int i = 0; i < word.length(); i++) {
//            char sign = word.charAt(i);
//            Path filePath = Path.of("C:\\Java_Projects\\Projects\\Java\\src\\main\\resources"+"\\"+sign +".txt");
//            Files.createFile(filePath);
//            Files.writeString(filePath, "start write context", StandardOpenOption.WRITE);


