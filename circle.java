import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Shape{
    int length;
    int breadth;
    abstract void area();
}

class Shapes extends Shape{
    Shapes(int len,int bre)
    {
        this.length=len;
        this.breadth=bre;
    }
    public void area(){
        System.out.println(this.length+" "+this.breadth);
    }
}

class Rectangle extends Shape{
    Rectangle(int leng,int brea)
    {
        this.length=leng;
        this.breadth=brea;
    }
    public void area(){
        System.out.println(this.length*this.breadth);
    }
}



public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shapes(l,b);
        shape.area();

        Shape rectangle = new Rectangle(l,b);
        rectangle.area();
    }
}
