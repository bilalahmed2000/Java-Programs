/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Bilal
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangle r1 = new rectangle(2.0,3.0);
        double a1 = r1.getarea();
        System.out.println(a1);
        double p1 = r1.getperimeter();
        System.out.println(p1);
        
  System.out.println(r1);
   rectangle r2 = new rectangle(4,3);
        double a2 = r2.getarea();
        System.out.println(a2);
        double p2 = r2.getperimeter();
        System.out.println(p2);
        
  System.out.println(r2);
    }
}
    class rectangle
    {
    double width,height;
    rectangle()
    {
    this(1,1);
    }
    rectangle(double h,double w){
      width = w;
      height = h;
    }
    public double getarea()
    {
    double area = width*height;
    return area;
    }
     public double getperimeter()
    {
    double perimeter = 2* (width+height);
    return perimeter;
    }
     public void display()
     {
     
     }
     @Override
    public String toString(  )  
    {
       return "Height is :"+height+"Width is ;"+width+ " ";
    }
 
    }
   
    

