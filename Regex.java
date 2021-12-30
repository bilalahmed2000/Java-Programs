/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.util.regex.*;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Bilal
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       	
        System.out.println("enter input");
       Scanner sc=new Scanner(System.in);	 
     String [] test= sc.nextLine().split("\\s+");
     
	for(String i:test){
            
        }	
        String [] keyword = {"int","float","String","double","boolean"};
        String [] operator = {"[-]","[+]","[=]","[;]"};
        for(int j=0;j < test.length;j++)
        {
        
        for(int k =0; k<keyword.length;k++){
        Pattern keywordp = Pattern.compile(keyword[k]);
        Matcher keymatch = keywordp.matcher(test[j]);
        boolean m = keymatch.matches();
         if(m==true){
          System.out.println("keyword");
          }
        }
        
        for(int r = 0;r<operator.length;r++){
        Pattern operatorp = Pattern.compile(operator[r]);
        Matcher opmatch = operatorp.matcher(test[j]);
        boolean n = opmatch.matches();
         if(n==true){
          System.out.println("operator");
          }
        }
        
        
        Pattern intc = Pattern.compile("[+-]?[0-9]+");
        Pattern floatc = Pattern.compile("[+-]?[0-9]*[.][0-9]+");
        Pattern charc = Pattern.compile("'(\\\\[tvrnafb\\\\]|[^\\\\'])'");
        Pattern Stringc = Pattern.compile("\".*?\"");
        Pattern identifier = Pattern.compile("([A-Za-z][_]?|_)([A-Za-z0-9]+[_]?)*");
         Matcher intcmatch = intc.matcher(test[j]);
         Matcher floatcmatch = floatc.matcher(test[j]);
        
        Matcher idmatch = identifier.matcher(test[j]);
        
         
         
         Matcher charcmatch = charc.matcher(test[j]);
         Matcher SCmatch = Stringc.matcher(test[j]);
          boolean b = intcmatch.matches();
          boolean c = floatcmatch.matches();   
           boolean d = idmatch.matches();
            boolean e = charcmatch.matches();
            boolean f = SCmatch.matches();
          if(b==true){
          System.out.println("int constant");
          }
         
           if(c==true){
          System.out.println("floatc ");
          }
           if(d==true){
          System.out.println("identifier ");
          }
            if(e==true){
          System.out.println("charc ");
          }
             if(f==true){
          System.out.println("Stringc ");
          }

   
            
        }
    }
    
}
