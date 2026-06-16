public class CalculatorTaskUsingMethod {
    // add two integer

    static int add(int a, int b) {
        return a+b;
    }
    // add two double

    static double add(double a,double b){
        return a+b;
    }
    // multiplay two integer

    static int mul(int a,int b) {
        return a*b;
    }
    // Methodoverloading multiplay three  integer

    static int mul (int a, int b, int c){
        return a * b * c;
    }
    public static void main (String[]args) {
        System.out.println("add Integer :" + add (20,30));
        System.out.println("add double:" + add(20.5,60.5));

        System.out.println("Multiply two Number:" + mul(5,56));
        System.out.println("Multiply three Number:" + mul(10,2,36));
    }
}
