/*
 * Variable is an data container which sahves the data value. There are three types.
 * 1.   Local variable       : A variable which is defined in block or methordor  constructor.
 *                            These variables are created when block/Method/constructor is called and distroyed after exiting the block.
 * 2.   Instance Variable    : Instance variale are non-static variable and are declared in a class outside of any block/method/constructor.
 *                            These variable are created when an object of calss is created and distroyed when object is distroyed.
 *                            Unlike local variable we must use access specifier (Public, Private and Protected).
 * 3.   Static Variable      : Similar to Instance Variable, but it is declared using a keyword "Static". It can be declared witin a calss or outside of any method/block/constructor.
 *                           : Static variabe is created at the start of excution of program and gets distroyed after the excution.
 */

package JavaVarible;

public class JavaVarible {
    public static int k = 30;           // Static Varible
    public  int j = 20;                       //Instance Varible
    public static void main(String[] args)
    {
        int i = 10;
        //j = 20;
        System.out.println(" i, j , k = ", +i, +j, +k );
        
    }
}
