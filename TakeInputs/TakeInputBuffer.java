/*BUFFER READER CLASS
 * 
 * It is an simple class used to read 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TakeInputBuffer
 */
public class TakeInputBuffer {

    //Creating BufferReader object
    //InputStreamReader to conbert Byte to stream of character.
    public static void main(String[] args) 
    throws IOException {
       BufferedReader bfn = new BufferedReader(
        new InputStreamReader(System.in)
       );
       System.out.println("Enter Name : ");
       String str = bfn.readLine();
        System.out.println("Enter Roll No");
       int i = Integer.parseInt(bfn.readLine());


    }
}