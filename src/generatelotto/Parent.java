package generatelotto;
import java.util.Random;

public class Parent{
    public   Parent()
    {
        System.out.println( "A Parent Lives!" );
    }

    public String   getName()
    {
        return   "Parent";
    }
  
    public void   printName()
    {
          System.out.println( "I am a " + this.getName() +   "." );
    }

    public void   printMessage()
    {
          System.out.println( "A Parent is smarter than any Child." );
    }

    public static   void printStaticMessage()
    {
          System.out.println( "Any Parent is some Child's Parent." );
    }
}