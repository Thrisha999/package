package mypack;
import java.util.*;

import javax.swing.text.PlainDocument;

public class Package 
{
    public static void main(String[] args)
    {
       int a,b;
       Scanner in = new Scanner(System.in);
       System.out.println("enter values of a and b");
       a=in.nextInt();
       b=in.nextInt();
       System.out.println("sum= "+(a+b));
    }
}
