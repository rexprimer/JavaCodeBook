import java.util.Arrays;

@SuppressWarnings("unused")
public class testmerg {

    public static void main(String[] args) {
        int[] unsortedArray = {1, 4, 2, 3, 5, 6, 7, 8, 10, 15, 12, 1, 7, 14};
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted array:   " + Arrays.toString(mergeSort(unsortedArray)));
    }

    private static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] leftSubarray = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] rightSubarray = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(leftSubarray, rightSubarray);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }

        // Combine remaining elements using a single loop
        while (i < left.length || j < right.length) {
            if (i < left.length) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }

        return mergedArray;
    }

    // Helper function to swap two elements (optional)
} 
