package Zajecia3.ZadanieDodatkowe;

public class Main {
    public static void main(String[] args) {

        Object[] message = {"Ala", "ma", "rudego", "kota"};
        Object[] numbers = {0, 1, 5, 3, 4, 2};
        Object[] letters = {'i', 'e', 'r', 'c', 'm'};

        ArrayOperations swapping = new ArrayOperations<>();

        for (Object o : swapping.swapArrayElements(message, 0, 3)) {
            System.out.print(o + " ");
        }
        System.out.println();
        for (Object o : swapping.swapArrayElements(numbers, 2, 5)) {
            System.out.print(o + " ");
        }
        System.out.println();
        for (Object o : swapping.swapArrayElements(letters, 4, 0)) {
            System.out.print(o + " ");
        }
    }
}

