public class TaskThree {
    public static void taskThree() {
        System.out.println("Task 3. Shape hierarchy");

        Cylinder cylinder = new Cylinder(5, 10);
        Ball ball = new Ball(7);
        Pyramid pyramid = new Pyramid(25, 12);

        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("Cylinder radius: " + cylinder.getRadius());

        System.out.println("Ball volume: " + ball.getVolume());
        System.out.println("Ball radius: " + ball.getRadius());

        System.out.println("Pyramid volume: " + pyramid.getVolume());
    }
}

class Shape {
    double volume;

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    double radius;

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = Math.PI * radius * radius * height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        this.radius = radius;
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (1.0 / 3.0) * s * h;
    }
}