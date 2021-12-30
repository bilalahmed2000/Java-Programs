/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;


/**
 *
 * @author Bilal
 */
public class JavaApplication17 {
    static String []input;
   static int i=0;
   
   public static boolean S(){
   if(X()){
   
   if (Y()){
   return true;
   }
   
   }
   return false;
   }
   
   
   
   public static boolean  X(){
   if (input[i].equals("a")){
        
   i++;
   if(X()){
   return true;
   }
   }
   else{
   return true;
   }
    return false;
   }
   
   public static boolean Y(){
   if (input[i].equals("b")){
       
   i++;
   if(Y()){
   return true;
   }
   }
   else if (input[i].equals("c"))
   {
        
       i++;
       return true;
   }
   return false;
   
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner sc= new Scanner(System.in);
        String x=sc.next()+"$";
        input=x.split("");
        
        for(String a: input){
        System.out.println(a);
        }
      
       if (S()){
       if("$".equals(input[i])){
            System.out.println(input[i]);
       System.out.println("valid");
       }  else{
       System.out.println("invalid");
       }
      
       }
       else{
       System.out.println("invalid");
       }
      
    
    }
    
}





