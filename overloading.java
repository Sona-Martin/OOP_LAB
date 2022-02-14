/*P5. Write a Java program to calculate the area of different shapes namely circle, rectangle and triangle using the concept of method overloading.*/

import java.util.Scanner;
class overloading
{
           
                      void area(double r)
                      {
                        
                        double a = 3.14*r*r;
                        System.out.println("Area of Circle is : "+a);
                      }   
                      
                      void area(int l, int b)
                      {
                        
                        int a = l*b;
                        System.out.println("Area of Rectangle is : "+a);
                      }    
                       
                      void area(double l, double b)
                      {
                        
                        double a = 0.5*l*b;
                        System.out.println("Area of triangle is : "+a);
                      }  
            public static void main(String args[])
            {
                  Scanner sc= new Scanner(System.in);
                  overloading A = new overloading();
                  
                  System.out.println("Enter radius of Circle :"); 
                  double r=sc.nextDouble(); 
                  A.area(r);
                  
                  System.out.println("Enter length and breadth of Rectangle:"); 
                  int l=sc.nextInt(); 
                  int b=sc.nextInt();  
                  A.area(l,b);
                         
                  
                  System.out.println("Enter height and base length of triangle:");
                  double h =sc.nextDouble(); 
                  double ba =sc.nextDouble(); 
                  A.area(h,ba);
            }
}
