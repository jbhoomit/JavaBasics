public class AbstractClass {
    abstract class Animal {

        void eat() {
            System.out.println("Animal is eating");
        }
    }
    class Dog extends Animal {

    }

    public static void main(String[] args) {

        AbstractClass obj = new AbstractClass();

        Dog d = obj.new Dog();

        d.eat();
    }
}