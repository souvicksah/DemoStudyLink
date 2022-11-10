import java.util.*;
class P2
{
   public static void main(String []args)
  {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      recur(num,1);
  }
  static void recur(int num,int count)
  {
      if(num/10==0){
          System.out.print(num*count);
          return;
         }
      recur(num/10,count*10);
      if(num%10!=0)
         System.out.print("+"+(num%10)*count);
  }
}