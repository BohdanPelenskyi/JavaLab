public class TaskFour {
    public static void taskFour() {
        System.out.println("Task 4. Abstract Car class");

        Sedan sedan = new Sedan("Toyota Camry", "Black", 220);
        Truck truck = new Truck("Volvo FH", "White", 120);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }
}

abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println(model + " is accelerating. Maximum speed: " + maxSpeed + " km/h.");
    }

    public abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Sedan " + model + " is braking smoothly.");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Truck " + model + " uses pneumatic brakes.");
    }
}