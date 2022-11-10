import java.util.*;
class P3
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       float sum=0.0f,per=0.0f;
       for(int i=1;i<=5;i++)
            sum=sum+sc.nextFloat();
       System.out.println("percentage marks :"+sum/5+"%");
   }
}