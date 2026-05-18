import java.util.Random;

public class Helper {
    public static TaxiCar dispatchCar(TaxiCar[] cars) {
        Random random = new Random();

        int randomIndex = random.nextInt(cars.length);

        TaxiCar selectedCar = cars[randomIndex];

        System.out.println("Car brand " + selectedCar.brand
                + " with driver " + selectedCar.driver.name
                + " is on the way to you");

        return selectedCar;
    }

    public static void arrive(TaxiCar car) {
        System.out.println("Driver " + car.driver.name + " has arrived at the destination");
    }
}