import java.util.ArrayList;

public class TaskOne {
    public static void taskOne() {
        System.out.println("Task 1. Taxi service");

        ArrayList<TaxiCar> cars = new ArrayList<>();

        cars.add(new TaxiCar("Toyota Corolla", 110, new Driver("Ivan", 26, 4), 15000, 2015));
        cars.add(new TaxiCar("Skoda Octavia", 150, new Driver("Oleh", 30, 8), 18000, 2017));
        cars.add(new TaxiCar("Renault Logan", 90, new Driver("Petro", 22, 2), 10000, 2014));
        cars.add(new TaxiCar("Volkswagen Golf", 140, new Driver("Maksym", 28, 3), 16000, 2016));
        cars.add(new TaxiCar("Ford Focus", 125, new Driver("Serhii", 35, 10), 14000, 2013));
        cars.add(new TaxiCar("Hyundai Accent", 100, new Driver("Dmytro", 27, 4), 12000, 2018));
        cars.add(new TaxiCar("Kia Rio", 123, new Driver("Andrii", 40, 15), 13000, 2019));
        cars.add(new TaxiCar("Mazda 3", 150, new Driver("Vasyl", 24, 1), 17000, 2016));
        cars.add(new TaxiCar("Honda Civic", 142, new Driver("Yurii", 31, 7), 16500, 2017));
        cars.add(new TaxiCar("Nissan Sentra", 130, new Driver("Vitalii", 29, 6), 14500, 2015));

        System.out.println("\nInitial car fleet:");
        printCars(cars);

        System.out.println("\nRepairing half of the car fleet and hiring new drivers...");
        for (int i = 0; i < cars.size() / 2; i++) {
            TaxiCar car = cars.get(i);
            car.power = car.power * 1.10;
            car.driver = new Driver("New Driver " + (i + 1), 30, 5);
        }

        System.out.println("\nIncreasing power and price for every second car...");
        for (int i = 0; i < cars.size(); i += 2) {
            TaxiCar car = cars.get(i);
            car.power = car.power * 1.10;
            car.price = car.price * 1.05;
        }

        System.out.println("\nChecking drivers' experience...");
        for (TaxiCar car : cars) {
            Driver driver = car.driver;

            if (driver.experience < 5 && driver.age > 25) {
                driver.experience = driver.experience + 1;
                System.out.println(driver.name + " was sent to training courses. New experience: "
                        + driver.experience + " years");
            }
        }

        System.out.println("\nCar fleet after changes:");
        printCars(cars);

        System.out.println("\nTaxi call:");

        TaxiCar[] carArray = cars.toArray(new TaxiCar[0]);

        TaxiCar selectedCar = Helper.dispatchCar(carArray);
        Helper.arrive(selectedCar);
    }

    public static void printCars(ArrayList<TaxiCar> cars) {
        for (TaxiCar car : cars) {
            System.out.println(car);
        }
    }
}