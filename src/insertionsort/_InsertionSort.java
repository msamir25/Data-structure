package insertionsort;

import java.util.Random;

public class _InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[10];       //generate 10 random numbers

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Before:");
        printArray(numbers);

        System.out.println("\nAfter:");
        insertionSort(numbers);
        printArray(numbers);

    }
    static void insertionSort(int []arr){
        int key , j;
        for (int i =1; i< arr.length; i++){
            key = arr[i];
            j =i-1;
            while (j >=0 && arr[j] > key){
                arr[ j + 1] = arr[ j ];
                j--;
            }
            arr[j+1] = key;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
