public class ClassObject {

    class Student {
        String name = "Bhoomit";
        int age = 22;
        long number = 7297875390L;

        void display() {
            System.out.println("Name   : " + name);
            System.out.println("Age    : " + age);
            System.out.println("Number : " + number);
        }
    }

    public static void main(String[] args) {
        ClassObject obj = new ClassObject();
        Student s = obj.new Student();
        s.display();
    }
}