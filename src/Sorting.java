import java.security.SecureRandom;
import java.util.Arrays;

/*
* All sorts were referenced from the Yuzu textbook for computer science.
* Author: James Williams
* */
public class Sorting {

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int[] inputArray = rand.ints(10,10,100).toArray();
        insertionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));

        inputArray = rand.ints(10,10,100).toArray();
        selectionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }

            }
            swap(arr, min_index, i);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int toInsert = arr[i];
            int insertIndex = i;

            while (insertIndex > 0 && arr[insertIndex - 1] > toInsert) {
                // shift element right one slot
                arr[insertIndex] = arr[insertIndex - 1];
                insertIndex--;
            }

            arr[insertIndex] = toInsert; // place inserted element
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
