import java.util.Arrays;

public class Sorting {

    public static void main (String[] args)
    {
        int[] inputArray = {6,2,4,3,1};
        selectionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_index = i;
            for (int j = i+1; j<arr.length; j++)
            {
                if (arr[min_index] > arr[j])
                {
                    min_index = j;
                }

            }
            swap(arr, min_index, i);
        }
    }

    public static void insertionSort(int[] arr){
        //for (int )
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
