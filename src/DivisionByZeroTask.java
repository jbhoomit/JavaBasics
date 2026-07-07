import java.util.Scanner;
public class DivisionByZeroTask {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println("Result = " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }
            try {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                System.out.println("You entered: " + num);
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a number.");
            }

            try {
                int arr[] = {10, 20, 30};

                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index is out of range.");
            }

        }
    }

