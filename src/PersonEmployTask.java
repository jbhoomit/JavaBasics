public class PersonEmployTask {
    class person{
        person(){
            System.out.println("person constructor");
        }
        void disply(){
            System.out.println("I am a pankaj jain");
        }
    }
    class Employee extends person{
              Employee() {
            super();
            System.out.println("Employee constructor");
        }

        @Override
        void disply() {
            super.disply();
            System.out.println("I am a bhummit jain ");
        }
    }
    class Manager extends Employee {
        Manager(){
            super();
            System.out.println("Manager constructor");
        }
        void show(){
            super.disply();
            System.out.println("I am a sahil soni");
        }
    }
    public void main(String[]args) {
        Manager m = new Manager();
        m.show();
    }
}
