import java.util.Scanner;
public class ClaculatorTask {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num");
        int a = sc.nextInt();

        System.out.println("Enter second num");
        int b = sc.nextInt();

        //Arithmatic Operator
        System.out.println("addition(+)"+(a+b));
        System.out.println("subtraction(-)-" + (a+b));

        //Relation Operator
        System.out.println("Equal (==)" +(a==b));
        System.out.println("not equal(!=)" + (a!=b));

        //Logical Operator
        System.out.println("(a > 0 && b > 0)" +(a > 0 && b>0)); // And
        System.out.println("(a > 0 || b > 0)" +(a > 0 && b > 0));

        // Assigment Oprator
        System.out.println("a += b : " + a);
        System.out.println("b -= b : " + b);

    }
}
