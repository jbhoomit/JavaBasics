import java.util.Scanner;
public class ElectricBillClaculator {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter units consumed");
        int units = sc.nextInt();

        double bill;

        if (units <= 100){
            bill = units * 10;
        } else if (units <= 200){
            bill =units * 20;
        } else {
            bill =units * 50;
        }
        System.out.println("Electricity bill = $" + bill);
        }
    }

