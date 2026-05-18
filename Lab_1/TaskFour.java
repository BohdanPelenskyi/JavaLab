public class TaskFour {
    public static void taskFour() {
        Car[] cars = new Car[10];

        cars[0] = new Car(140, 1.8, "Skoda", "Octavia", 2019, 205, 21000);
        cars[1] = new Car(220, 2.2, "Kia", "Stinger", 2022, 240, 32000);
        cars[2] = new Car(105, 1.5, "Renault", "Megane", 2018, 185, 14000);
        cars[3] = new Car(260, 3.2, "Lexus", "IS350", 2021, 230, 42000);
        cars[4] = new Car(310, 4.0, "Porsche", "Panamera", 2023, 270, 68000);
        cars[5] = new Car(95, 1.3, "Peugeot", "208", 2017, 170, 11000);
        cars[6] = new Car(180, 2.0, "Subaru", "WRX", 2020, 235, 26000);
        cars[7] = new Car(400, 5.0, "Chevrolet", "Camaro", 2019, 275, 39000);
        cars[8] = new Car(125, 1.6, "Nissan", "Sentra", 2021, 200, 19500);
        cars[9] = new Car(210, 2.4, "Alfa Romeo", "Giulia", 2022, 225, 36000);

        int totalHorsepower = 0;
        double totalVolume = 0;

        for (Car car : cars) {
            totalHorsepower += car.horsepower;
            totalVolume += car.engineVolume;
        }

        System.out.println("Total horsepower of all cars: " + totalHorsepower + " hp");
        System.out.println("Total engine volume: " + totalVolume + " L");
    }
}