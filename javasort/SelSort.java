/*
 * Selection Sot
 * -------------
 * this algorith repeatetily finds the smallest and largest elements of the array ans swaps with the current number
 * Best Case - O(N)
 * Avg Case -  O(N*N)
 * Worst Case - O(n*N)
 * Sapce Complexity - o(1)
 */

import java.util.Arrays;

public class SelSort {

    public static void main(String[] args) {
        int [] arr = {1,4,2,6,8,9,3,10,100,91,76,34};
        System.out.println("Array   :   " +Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(("Sorted Array : ") +Arrays.toString(arr));
    }

    private static void SelectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            int temp;
            for(int j = i + 1; j<arr.length; j++) // find the minimum index
            {
                if(arr[j]< arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if (i != minIndex){             // if min index is found, then swap with ith element
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }
}