package binarysearch;

public class _BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 5, 7, 9, 11};
        System.out.println("1 is at position: " + binarySearch(ints, 0, ints.length , 1));

    }

    static int binarySearch(int [] arr , int low , int high , int key ){
        int mid = (low + high) / 2;
        if (low <= high){
            if (arr[mid] == key){
                return mid;
            }
            else if (arr[mid] > key){
                return binarySearch(arr , low , mid-1 , key);
            }else {
                return binarySearch(arr , mid + 1 , high , key);
            }
        }
        return -1;
    }
}
