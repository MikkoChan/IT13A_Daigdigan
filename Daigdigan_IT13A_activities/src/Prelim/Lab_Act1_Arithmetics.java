
package Prelim;

import java.util.Scanner;


public class Lab_Act1_Arithmetics {
    Scanner in = new Scanner(System.in);

    System.out.printIn ("Enter First number: ");
        int x= in.nextInt();

    System.out.print("Enter Second number: ");
        int y= in.nextInt();

    System.out.print("Enter Third number: ");
        int z= in.nextInt();       


        System.out.println(x + "*"+ y + "+" z + "=" + (x*y+z));
        System.out.println("(" + x + "-" + y + ")%" + z + "=" + ((x-y)%z));
        System.out.println("(" + x + "+" + y + "+" + z +")" + "/3"+"=" + ((x+y+z)/3));
        System.out.println(x + "*" + z + "-(" + y + "*" + Y + "=" + (x*z-(y*y)));

}
