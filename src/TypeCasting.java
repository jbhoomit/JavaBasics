public class TypeCasting {
    public static void main(String[]args) {
        //widening casting
        int num = 100;
        double d = num;
        System.out.println("Int value:" +num);
        System.out.print("Double value:" +d);




        // narrowing casting
        double price =99.99;
        int p = (int) price;
        System.out.println("Orignal double:" +price);
        System.out.println("converted int: " +p);

    }
}
