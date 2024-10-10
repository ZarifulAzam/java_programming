
package firstapplication;
import java.util.Scanner;
class A
{
 int n=0,rev=0;
 String s;
    A()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        s=input.next();
        n=Integer.parseInt(s);
    }
void x()
    {
        int r;
        while(n>0)
       {
         r=n%10;
         n=n/10;
         rev=rev*10+r;
       }
    }
}
public class reverse extends A 
{
    void B()
    {
        System.out.println("reverse = "+rev);
    }
    public static void main(String[] args) {
        reverse obj = new reverse();
        obj.x();
        obj.B();
    }
        
   
}

