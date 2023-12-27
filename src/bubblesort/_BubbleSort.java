package bubblesort;

import java.util.Arrays;



public class _BubbleSort {
        public static void main(String[] args) {
            int [] arr = {100 , 60 , 20, 50 ,30 ,90};
            System.out.println(Arrays.toString(arr));
            bubblesort(arr);
            System.out.println(Arrays.toString(arr));


        }

        static void bubblesort(int [] arr){
            int n = arr.length;
            boolean flag =true;
            for (int i =0; i<n-1; i++){
                for (int j=0; j<n-i-1; j++){
                    if (arr[j] > arr[j+1]){
                        swap(arr , j ,j+1);
                        flag =false;
                    }
                }
                if (flag) {
                    break;
                }
            }

        }

        private static void swap(int[] arr, int i, int i1) {
            int temp = arr[i];
            arr[i]= arr[i1];
            arr[i1] = temp;
        }
}

