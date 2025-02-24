
package Prelim;

import java.util.Scanner;


public class Lab_Act2_Daigdigan {
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);
        boolean u = true;
        while(u){
            
            System.out.println("Input the 1st Number:");
            int x = scanner.nextInt();
            
            System.out.println("Input the 2nd number:");
            int y = scanner.nextInt();
            
            System.out.println("Input the 3rd number:");
            int z = scanner.nextInt();
            
            
            int greatest =  Math.max(Math.max(x, y) ,z);
            
            System.out.println("The Greatest Number is:" + greatest);
            
            System.out.println("\n Do you want to enter new values? (Yes/No)");
            String response = scanner.next();
            if (response.equalsIgnoreCase("No")){
                u = false;
            }
            System.out.println("\n Program Ended");
            }
        }

   
        }
   
       



