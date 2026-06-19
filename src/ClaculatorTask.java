import java.util.Scanner;
public class ClaculatorTask {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();

        System.out.println("Enter first num");
        int a = sc.nextInt();

        System.out.println("Enter second num");
        int b = sc.nextInt();


        System.out.println("Choose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5 Exits");


        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();


        switch (choice) {

            case 1:
                System.out.println("Addition = " + (a + b));

                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));

                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));

                break;

            case 4:
                if (b != 0) {
                    System.out.println("Division = " + (a / b));
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
    }
}
