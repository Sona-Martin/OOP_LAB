/*Write a Java program to create an abstract class named Shape that contains an empty method named numberOfSides(). Provide three classes named Rectangle, Triangle, and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides()that shows the number of sides in the given geometrical structures.
*/


 abstract class Shape
{
            abstract void numberofsides();
}
class Rectangle extends Shape
{
            void numberofsides()
            {
                        System.out.println("Number of sides of Rectangle is : 4");
            }
}
class Triangle extends Shape
{
            void numberofsides()
            {
                        System.out.println("Number of sides of Triangle is : 3");
            }
}
class Hexagon extends Shape
{
            void numberofsides()
            {
                        System.out.println("Number of sides of Hexagon is : 6");
            }
}
class abstrshape
{
            public static void main(String args[])
            {
                        Shape s;// s is just a data member of shape
                        s=new Circle();//now s becomes an object
                        s.numberofsides();
                        s=new Triangle();
                        s.numberofsides();
                        s=new Hexagon();
                        s.numberofsides();      
                       
            }
}
