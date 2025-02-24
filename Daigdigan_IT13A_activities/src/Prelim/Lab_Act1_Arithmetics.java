
package Prelim;

import java.util.Scanner;
public class Lab_Act1_Arithmetics {
 
public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println ("Enter First number: ");
        int x= in.nextInt();

    System.out.print("Enter Second number: ");
        int y= in.nextInt();

    System.out.print("Enter Third number: ");
        int z= in.nextInt();       


        System.out.println(x + "*" + y + "+" + z + "=" + (x*y+z));
        System.out.println("(" + x + "-" + y + ")%" + z + "=" + ((x-y)%z));
        System.out.println("(" + x + "+" + y + "+" + z +")" + "/3"+"=" + ((x+y+z)/3));
        System.out.println(x + "*" + z + "-(" + y + "*" + y + "=" + (x*z-(y*y)));

}
   
}
