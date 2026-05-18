public class TaxiCar {
    String brand;
    double power;
    Driver driver;
    double price;
    int year;

    public TaxiCar(String brand, double power, Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car brand: " + brand
                + ", power: " + String.format("%.2f", power)
                + ", driver: " + driver.name
                + ", price: " + String.format("%.2f", price)
                + ", year: " + year;
    }
}