/*
 * Diffrence between buffer and scanner.
 * Buffer readed reads as as stram of character, its is fast. Where as scanner is slow as it does post-Processing for parsing inputs (Next, NextLine, NextInt)
 * Buffer reader is more flexible as we can specify the size of the stream.ls
 */




import java.util.Scanner;

class TakeInputScanner{
    public static void main(String[] args)
    {
        //Define SCANNER
        //Scanner to read a string
            Scanner scm  = new Scanner(System.in);
            System.out.println("Enter Name : ");
            String name  = scm.nextLine();
        //Scanner to read integer
            System.out.println("ENter Roll Number : ");
            int Roll = scm.nextInt();
        //Scanner to read float    
            System.out.println("Enter Salary :");
            float sal = scm.nextFloat();

            System.out.println("Name : " +name);
            System.out.println("Roll : " +Roll);
            System.out.println("Salary : " +sal);

    }
}