import java.util.Arrays;

public class merg{
    public static void main(String[] args)
    {
        int[] arr1 = { 1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        System.out.println("Array 1 :   " +Arrays.toString(arr1));
        System.out.println("Array 2 :   " +Arrays.toString(arr2));
        System.out.println("Merged and Sorted Array :   " +Arrays.toString(merg(arr1, arr2)));

    }

    private static int[] merg(int[] left, int[] right) {
        int merged[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length)
        {
            if(left[i] <= right[j]){
                merged[k++] = left[i++];
            }
            else
            {
                merged[k++] = right[j++];
            }

        }
        return merged;
    }
}