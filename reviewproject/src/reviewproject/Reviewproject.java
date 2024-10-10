
package reviewproject;
import java.util.Scanner;


public class Reviewproject {

    
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        String s;
        s=obj.next();
        a=Integer.parseInt(s);
        s=obj.next();
        b=Integer.parseInt(s);
        c=a+b;
        System.out.println(c);
    }
    
}
