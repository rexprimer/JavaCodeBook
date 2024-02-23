import java.util.Scanner;

public class TakeInputScanner2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

         int sum = 0,  count = 0;

         while(sc.hasNextInt())
         {
            int num = sc.nextInt();
            sum += num;
            count++;
         }
         if (count>0)
         {
            System.out.println("Mean : " +sum/count);
         }
         else System.out.println("No integer were input!!");

    }
}
    