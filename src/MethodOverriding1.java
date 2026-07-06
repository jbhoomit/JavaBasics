public class MethodOverriding1 {
    class Vehicle{
        void Start(){
            System.out.print("Vehicle Start");
        }
    }
    class Bike extends Vehicle{
        void start(){
            System.out.print("Bike start with self");
        }
    }
    public void main(String[]args) {
        Bike obj = new Bike();
        obj.Start();
    }
}
