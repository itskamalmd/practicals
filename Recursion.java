import java.util.Scanner;

class Recursion {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++ ){
            System.out.println(String.format("factorial of %d is %d",i,factorial(i)));
        }   
    }
    static int factorial (int num) {
        if (num <= 1){
            return 1;
        }
        else 
            return num * factorial(num-1);
    }
}