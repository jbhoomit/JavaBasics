public class RuntimePolymorphism {

        class Animal{
            void sound(){
                System.out.println("Animal makes sound");
            }
        }
        class Dog extends Animal{}
        void sound(){
            System.out.println("Dog barks");
        }
        public void main(String[]args) {
            Animal obj = new Dog();
            obj.sound();
        }
    }


