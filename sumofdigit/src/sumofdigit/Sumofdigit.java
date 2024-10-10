
package sumofdigit;
import java.util.Scanner;
class A
{
    int n=0,sum=0;
    A()
    {
        String s;
        Scanner input=new Scanner(System.in);
        s=input.next();
        n=Integer.parseInt(s);
    }
    void x()
    {
        int r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
    }
}
public class Sumofdigit extends A
{
    void y()
    {
        System.out.println("sum is"+sum);
    }
    public static void main(String[] args)
    {
        Sumofdigit obj=new Sumofdigit();
        obj.x();
        obj.y();
    }
    
}
