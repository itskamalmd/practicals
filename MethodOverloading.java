import java.util.Scanner;

class FindMaximum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter the First Number");
        num1 = scan.nextInt();
        System.out.println("Enter the second Number");
        num2 = scan.nextInt();
        System.out.println("Enter the third Number");
        num3 = scan.nextInt();

        System.out.println("Maximum number for  first two Numbers are " + maximum(num1,num2));
        System.out.println("Maximum number for  first three Numbers are " + maximum(num1,num2,num3));
    }
    static int maximum(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }
    static int maximum (int num1,int num2,int num3){
        return maximum(maximum(num1,num3),num3);
    }
}
