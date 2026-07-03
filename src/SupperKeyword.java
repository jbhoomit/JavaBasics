public class SupperKeyword {

        static class Animal {
            void sound() {
                System.out.println("Animal makes sound");
            }
        }
        static class Dog extends Animal {

            @Override
            void sound() {
                System.out.println("Dog barks");
            }

            void display() {
                super.sound();
                sound();
            }
        }

        public static void main(String[] args) {

            Dog d = new Dog();
            d.display();
        }
    }