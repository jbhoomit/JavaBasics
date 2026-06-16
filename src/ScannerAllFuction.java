import java.util.Scanner;
public class ScannerAllFuction {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        // string one word
        System.out.println("Enter a word");
        String word = sc.next();
        System.out.println("word"+word);

        //string full line
        System.out.println("Enter full sentence");
        String sentence = sc.nextLine();
        System.out.println("sentence"+sentence);

        //int
        System.out.println("Enter the Integer ");
        int Integer =sc.nextInt();
        System.out.println("Integer" + Integer);

        //double
        System.out.println("Enter a decimal number");
        double d = sc.nextDouble();
        System.out.println("Double"+d);

        // float
        System.out.println("Enter the float value");
        float f = sc.nextFloat();
        System.out.println("float"+f);

        //long
        System.out.println("Enter the long value");
        long l = sc.nextLong();
        System.out.println("long"+l);

        //boolean
        System.out.print("Enter true or false");
        boolean b = sc.nextBoolean();
        System.out.println("boolean" + b);

    }
}
