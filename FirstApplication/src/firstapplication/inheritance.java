
package firstapplication;
class base
{
    int x=5;
    void inc()
    {
        x++;
        System.out.println(x);
    }
}
class derived extends base
{
    int y=10;
    void inc2()
    {
        y++;
        System.out.println(y);
        
    }
}
public class inheritance extends derived {
    public static void main(String[] args) {
        inheritance obj=new inheritance();
     
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
