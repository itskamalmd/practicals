import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionHandling {

    public static void main(String [] args){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number");
            int number1 = scan.nextInt();
            System.out.println("Enter second number");
            int number2 = scan.nextInt();
            System.out.println("The sum of the entered numbers : " + (number1 + number2));
        }
        catch(NumberFormatException e){
            System.out.println("The Entered Value is not an integer");
        }
        catch(InputMismatchException Err){
            System.out.println("catch Block : The Entered Value is not an integer");
        }
        finally{
            System.out.println("finally block: Exception hadling is done");
        }
    }
}
