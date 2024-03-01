/*
 * Array: It is an dynamically allocated array.
 * Array must be stored in contigous memeory allocations.
 * As array is object in java, so we can find the legth by "length" keywork. Where as in C++ its not possible.
 * 
 */

 class array1
 {
  
    public static void main(String[] args)
    {
        //ARRAY DECLARATION
        int[] arr;
        //ARRAY ALLOCATIONS
        arr =  new int[5]; 
        // ARRAY INITIALIXZATION
        arr[0] = 10;
        arr[1] = 20;
        arr[3] = 30;
        System.out.println("Size : " +arr.length);
        for(int i =0 ; i<arr.length; i++)
        {
            System.out.printf("Arr[" +i+  "] = " +arr[i]+ "      " );
        }
        

    }
 }