import java.util.*;
class P1
{  static boolean leapyear(int year)
   {
     if(year%400==0 || year%100!=0 && year%4==0)
             return true;
       else
             return false;
   }
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();
       System.out.println(leapyear(year));
   }
}