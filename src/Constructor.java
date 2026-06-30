public class Constructor {

    static class Student {

        // Default Constructor
        Student() {
            System.out.println("Object Created");
        }

        // Parameterized Constructor
        Student(String name) {
            System.out.println("Name: " + name);
        }
    }
    public static void main(String[] args) {

        Student s1 = new Student();

         Student s2 = new Student("Himani");
    }
}