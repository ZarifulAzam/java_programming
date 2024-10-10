
package midpractice;
import java.util.Scanner;
class Prime
{
  int n=0,i=0;
  String s;
  Prime()
  {
     System.out.println("enter any number");
     Scanner input=new Scanner(System.in);
     s=input.next();
     n=Integer.parseInt(s);
  }
  void x()
  {
      int flag=0;
      for(i=2;i<=n;i++)
      {
          if(n%i==0)
          {
              flag=1;
              break;
          }
      }
      
      
  }

    
}
public class Midpractice extends Prime 
{
    void y()
    {
        int flag=1;
        if(flag==0)
        {
            System.out.println("prime");
        }
        else
        System.out.println("not prime");
    }
    public static void main(String[] args) 
    {
        Midpractice obj=new Midpractice();
        obj.x();
        obj.y();
    }
    
}
