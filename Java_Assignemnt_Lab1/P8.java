import java.util.*;
class P8
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int salary=sc.nextInt();
       double grosssalary=0.0;
       if(salary<10000)
           grosssalary=salary+salary*.1+.9*salary;
       else
           grosssalary=salary+2000+.98*salary;

        System.out.println("Gross Salary:"+grosssalary);
   }
}