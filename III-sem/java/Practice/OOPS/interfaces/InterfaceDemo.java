// CTM : Interface fields are public, static and final by default i.e: int x === public static final int x;
//       Methods are public and abstract by default.
interface Shape
{
    final static double pi = 3.1415; //CTM : All the variables and methods in an interface are treated as constants even if the keywords final and static is not present 
    double e = 2.71828;
    double getArea(double x, double y); // CTM : final is used for making the constant just like 'const' in c/c++
}

class Rectangle implements Shape
{
    public double getArea(double x, double y)
    {
        return x * y;
    }
}

class Circle implements Shape
{
    public double getArea(double x, double y)
    {
        return pi * x * x; // we don't need 'y'
    }
}

public class InterfaceDemo
{
    public static void main(String []args)
    {
        Shape shape;
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        
        shape = r; //  a refer to Rectange class
        System.out.printf("Area of Rectangle with length 10 and width 21.5 is : %.2f%n", shape.getArea(10, 21.5));
        System.out.println("Value of pi is : " + shape.pi);
        System.out.println("Value of e is  : " + shape.e);

        shape = c; // a refers to Circle class
        System.out.printf("\nArea of Circle with radius 4.5 is : %.2f%n", shape.getArea(4.5, 0));
        System.out.println("Value of pi is : " + shape.pi);
        System.out.println("Value of e is  : " + shape.e);
    }
}