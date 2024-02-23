/*  
 * Bubble Sort - 
 * Best Case - O(N)
 * Worst Case - o(N*N)
 * Sapce Complecity  - O(1);
 */
import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = { 1,3,2,5,7,8,6};
        System.out.println("Array    :   " +Arrays.toString(arr));
        Bubble(arr);
        System.out.println("Sorted Arrya : " +Arrays.toString(arr));
    }

    private static void Bubble(int[] arr) {
        for(int i =0; i <arr.length-1; i++)
        {   int temp;
            for(int j = 0; j< i; j++)
            {   if(arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;   
            }       
            }
        }
    }
}