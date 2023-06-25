package Zajecia3.ZadanieDodatkowe;

public class ArrayOperations<T> {

    public ArrayOperations() {
    }

    public Object[] swapArrayElements(Object[] array, int firstSwapIndex, int secondSwapIndex) {

        Object[] temporary = new Object[2];// mamy dwa elementy do zamiany

        if ((array.length < 2)
                || (firstSwapIndex < 0 || firstSwapIndex > array.length - 1)
                || (secondSwapIndex < 0 || secondSwapIndex > array.length - 1)) {
            return null;
        } else if (firstSwapIndex == secondSwapIndex) {
            return array;
        } else {
                temporary[0] = array[firstSwapIndex];
                temporary[1] = array[secondSwapIndex];
                array[firstSwapIndex] = temporary[1];
                array[secondSwapIndex] = temporary[0];
            }
        return array;
    }
}
// komentarz Emila:
//
//        trochę zbyt duża
//        udało się ale pare uwag
//        Nie wyświetlamy wiadomości w konsoli jako komunikat, zamiast tego albo zwracamy null / albo wyrzucamy wyjątek jeśli faktycznie doszło do skrajnego przypadku
//        Nie ma potrzeby klonowania wartości .clone(), rozumiem że tu jest chęć zwrócenia nowej tablicy bez naruszania tej z argumentu, nie trzeba tak, możemy zamienić wartość w tej podanej
//        temporary to raczej duży koszt, tablica 1 milion elementów zostanie skopiowana, może lepiej temporary to 1 zmienna która przechowuję swapowany element
//        pętla for niepotrzebna, nie realizuje logiki tutaj żadnej
//        if isSwappingArrayPossible niepotrzebny, jeśli pojawia się wcześniej return / exception i dojdzie do jego wywołania to on przerywa dalszy kod w metodzie
//        generalnie zadanie było trudne także wynik interesującym, udało się