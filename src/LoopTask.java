import java.util.Scanner;

public class LoopTask {
    public static void main(String[]args){

        // multiply
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num+ "x" + i + "=" + (num * i) );
        }

        // factorial
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        int a=0;
        int b=1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a  + "" );

            int c = a+b;
            a=b;
            b=c;

        }

        //prime number

        System.out.println("Enter a number");
        int nume = sc.nextInt();
         int count = 0;

        for (int i = 1; i <=nume ; i++) {
            if(num % i  ==0) {
                count++;

            }
        }
        if(count== 2){
            System.out.println("prime number");
        } else  {
            System.out.println("Not a prime number");
        }


        //number pattern

        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.println(j);
            }
            System.out.println();
        }


        // character 

        for (int i = 'A'; i <='E' ; i++) {

            for (int j = 'A'; j <=i ; j++) {
                System.out.println(j);
            }
         System.out.println();
        }


        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.println(" *");
            }
        }
    }
}
