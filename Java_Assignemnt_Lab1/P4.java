import java.util.*;
class P4
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       double d=sc.nextDouble();
       int time=sc.nextInt();
       float rate=sc.nextFloat();
       System.out.println((d*time*rate)/100);
   }
}