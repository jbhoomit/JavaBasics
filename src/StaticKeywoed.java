public class StaticKeywoed {


    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.display();
    }
    }
class Student {

    static String college = "Gitanjali collage";

    String name = "Himani";

    void display() {
        System.out.println(name);
        System.out.println(college);
    }
}