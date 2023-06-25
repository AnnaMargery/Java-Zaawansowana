package Zajecia5.Exception;

public class OneOfElementsIsNotANumber extends RuntimeException {

    public OneOfElementsIsNotANumber(){
        super("Nie udalo sie przekonwertowac wartosci");
    }

}
//
//public class OneOfElementsIsNotANumberException extends RuntimeException {
//
//    public OneOfElementsIsNotANumberException() {
//        super("Nie udało się przekonwertować wartości!");
//    }
//}