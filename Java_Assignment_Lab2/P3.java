import java.util.*;
class Box
{
   private double height;
   private double width;
   private double depth;
   public void initialization(double h,double w,double d)
   {
       this.height=h;
       this.width=w;
       this.depth=d;
   }
   public void print()
   {
       System.out.println("Height:"+height+" Width: "+width+" Depth:"+depth);
   }
   public double volume()
   {
      return height*width*depth;
   }
}
class P3
{  
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       double height,width,depth;
       height=sc.nextDouble();
       width=sc.nextDouble();
       depth=sc.nextDouble();
       Box b=new Box();
       b.initialization(height,width,depth);
       b.print();
       System.out.println("Volume is: "+b.volume());
   }
}