public class CalculatorTaskDay7{
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        // Find Maximum, Minimum and Sum
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            sum = sum + arr[i];
        }

        // Find Average
        double average = (double) sum / arr.length;

        // Display Results
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        // Wrapper Class, Autoboxing and Unboxing
        int a = 100;          // Primitive

        Integer num = a;      // Autoboxing (Primitive → Wrapper)

        int b = num;          // Unboxing (Wrapper → Primitive)

        System.out.println("Primitive = " + a);
        System.out.println("Wrapper = " + num);
        System.out.println("Unboxing = " + b);
    }
}