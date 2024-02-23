/* Operators : its is an special symbol which are used for performing specific opertaions 
 * Types of Operators
 * 1.       Arithmatic
 * 2.       Urnary
 * 3.       Assignment
 * 4.       Relational
 * 5.       Logical
 * 6.       Ternary
 * 7.       Shift Operator
 * 8.       Bitwise
 * 
*/
package JavaOperators;

public class Operators {
    public static int airthmantic(int num1, int num2)
    {
        System.out.println("Number1 + Number2 = " +(num1 + num2));
        System.out.println("Number1 - Number2 =" +(num1 - num2));
        System.out.println("Number1 * Number2 =" +(num1 * num2));
        System.out.println("Number1 / Number2 =" +(num1 / num2));
        System.out.println("Number1 % Number2 =" +(num1 % num2));
        return 0;
    }
 //UNARY Operator: has only one operand   
    public static void unary(int num1, int num2)
    {
        System.out.println("Postincrement :" + (num1++));
        System.out.println("Preincrement :" +(--num1));
        System.out.println("postdecrement :" +(num2--));
        System.out.println("Preincremet :"+(--num2));
    }
 //Relationsl ==, !=, <, >, <=, >=, 
    public static void relational()
    {
        int a = 10;
        int b = 3;
        int c = 5;
 
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }   
    public static boolean logical()
    {
        boolean x = true;
        boolean y = false;
        System.out.printf("x = " +x, " y = " +y);
        System.out.println("x && y = " +(x && y ) );
        System.out.println("x || y = " +(x || y) );
        System.out.println("!x  =" +(!x));
        return false;
    }
    public static void main(String[] args)
    {
        int number1 = 20;
        int number2 = 5;
        System.out.printf("Number 1: " + number1, "Number 2: " + number2);

        airthmantic(number1, number2);
        unary(number1, number2);
        relational();
        logical();

        
    }
    
}
