/*
 * BC -
 * AC -
 * WC - O(N*N)
 * Space - O(1)
 */

import java.util.Arrays;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args)
    {
        int arr[] = { 1,8,2,3,5,7,9,21,3,47,632,76,32,2,12,};
        System.out.println("Array   :   " +Arrays.toString(arr));
        InSort(arr);
        System.out. println("Sorted Array :" +Arrays.toString(arr));
    }
    public static void InSort(int[] arr)
    {
        for(int i =1; i< arr.length; i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(temp < arr[j] && j > -1)
            {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}