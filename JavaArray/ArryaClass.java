/*
 * Methods in Java for Array.
 * asList()
 * BinarySearch(int Arr, Int key)
 * Compare()
 * Deephash()
 * HashCode()
 * setAll()
 */
 import java.util.Arrays;
 public class ArryaClass
 {
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 5, 12};
        int arr2[] = {9, 2,5,1,7,4,};

        Arrays.sort(arr);
        int key = 12;

        System.out.println("Result : " +Arrays.binarySearch(arr, key));

        System.out.println("Integer on Comparison : " +Arrays.compare(arr, arr2));
    }
 }