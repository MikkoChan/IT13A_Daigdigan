
package Midterm;


public class Fibbonacci {
    
    public static void main(String[] args){
        int x = 10;
       
           for (int i = 0; i < x; i++) {
        System.out.print(fibonacci(i) + " , ");
    }
}
    public static int fibonacci(int x) {
        if (x <= 1){
          return x;
    } else {
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
}

