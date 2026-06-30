public class FinalKeyword {

    static class Demo {

        // Final variable
        final int AGE = 22;

        void display() {
            System.out.println("Age: " + AGE);
        }
    }
    public static void main(String[] args) {

        Demo d = new Demo();
        d.display();
    }


    // final method
    class Animal{
        final void sound(){
            System.out.println("Animal Sound");
        }
    }
    public class Elephant extends Animal{
        public  void main(String[]args) {
            Elephant e =new Elephant();
            e.sound();
        }
    }

    // final class

    final class car {
        void display(){
            System.out.println("car class");
        }
    }
    public class test{
        public void main(String[]args) {
            car c = new car();
            c.display();
        }
    }


}