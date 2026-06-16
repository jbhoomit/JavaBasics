public class MethodOverloading {
     static void display(String name) {
        System.out.println("Name " + name);
     }
     static void display( int age) {
        System.out.println("Age " + age);
     }
     static void display(long num) {
         System.out.print("phone Number" + num);
    }
    public static void main(String[]args) {
         display("bhoomit jain");
         display(22);
         display (7297875390L);

    }
}
