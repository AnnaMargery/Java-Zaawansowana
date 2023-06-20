package Zajecia3.ZadanieDodatkowe;

public class ArrayOperations<T> {

    public ArrayOperations() {
    }

    public Object[] swapArrayElements(Object[] array, int firstSwapIndex, int secondSwapIndex) {

        Object[] result = array.clone();
        Object[] temporary = array.clone();

        boolean isSwappingArrayPossible = true;
        if ((array.length < 2)
                || (firstSwapIndex < 0 || firstSwapIndex > array.length - 1)
                || (secondSwapIndex < 0 || secondSwapIndex > array.length - 1)) {
            isSwappingArrayPossible = false;
            printErrorMessage();
            return null;
        } else if (firstSwapIndex == secondSwapIndex)
            return array;

        if (isSwappingArrayPossible) {
            for (int i = 0; i < array.length; i++) {

                result[firstSwapIndex] = temporary[secondSwapIndex];
                array[secondSwapIndex] = temporary[firstSwapIndex];
                result[secondSwapIndex] = array[secondSwapIndex];
            }
        }
        return result;
    }

    private void printErrorMessage() {
        System.out.println("Sorry swapping it's not possible.");
        System.out.println("Please check if array isn't too small (array must have minimum 2 elements to swap)," +
                "or index od element to be swapped are incorrect- out of bounds of an array);}");
    }
}
