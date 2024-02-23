import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("unused")
public class MergSort
{
    public static void main (String[] args)
    {
        int[] arr = { 1,4,2,3,5,6,7,8,10,15,12,1,7,14};
        System.out.println("Array   :   " +Arrays.toString(arr));
        System.out.println("Sorted Array :" +Arrays.toString(MergeSort(arr)));
    }

    private static int[] MergeSort(int[] arr) {
        if (arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid+1, arr.length));
        return merge(left, right);
    }
    private static int[] merge( int[] left, int[] right)
    {
        int[] combined = new int[ left.length + right.length];
        int i =0, j = 0, k = 0;
        while( i < left.length && j < right.length)
        {
            if(left[i] <= right[j]){
                combined[k++] = left[i++];
            }
            else{
                combined[k++] = right[j++];
            }
        }
        while(i < left.length)
        {
            combined[k++] = left[i++];
        }
        while(j < right.length)
        {
            combined[k++] = right[i++];
        }
        return combined;
    }
}