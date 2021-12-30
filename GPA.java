
package javaapplication8;

/**
 *
 * @author Bilal
 * 
 */


public class JavaApplication8 {


   
    public static void main(String[] args)
    {


{
  
  {
     int n=5;
 
     double m[]=new double[n];
 
     double g[]=new double[n];
 
     double cgpa,sum=0;
 
     m[0]=95;
 
     m[1]=85;
 
     m[2]=79;
 
     m[3]=87;
 
     m[4]=95;
 
     for(int i=0;i<n;i++)
     {
       g[i]=(m[i]/10);
     }
 
     for(int i=0;i<n;i++)
     {
        sum+=g[i];
     }
 
     cgpa=sum/n;
 
     System.out.println("cgpa="+cgpa/2.3);
 
     System.out.println("percantage from cgpa="+cgpa*9.5);
 
   }
}
    }
    


}
