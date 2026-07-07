 class VehiclePaymentTasks {
    abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stoped");
    }
}

interface payment {
    void pay();

}

class Car extends Vehicle implements payment {
    void start() {
        System.out.println("Car started");
    }

    public void pay() {
        System.out.println("Payment Successful");
    }
}

public void main(String[] args) {
    Car c = new Car();
    c.start();
    c.stop();
    c.pay();
}
}

