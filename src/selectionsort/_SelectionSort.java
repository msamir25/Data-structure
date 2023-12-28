package selectionsort;

import java.util.Random;

public class _SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[10];       //generate 10 random numbers

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Before:");
        printArray(numbers);

        System.out.println("\nAfter:");

        printArray(selectionSort(numbers));
    }

    static int [] selectionSort(int [] arr){
        int minIndex;
        int size = arr.length;

        for (int i=0; i<size-1; i++){
            minIndex= i;
            for (int j=i+1; j<size;j++){
                if (arr[j]< arr[minIndex]){
                    minIndex = j;       //select the min index in arr
                }
            }
            swap(arr , i , minIndex);       //swap my current value with min value in array
        }
        return arr;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
