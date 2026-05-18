public class TaskTwo {
    public static void taskTwo() {
        System.out.println("Task 2. Phone class");

        Phone phone1 = new Phone("097-111-22-33", "Samsung S23", 168.5);
        Phone phone2 = new Phone("050-444-55-66", "iPhone 15");
        Phone phone3 = new Phone();

        System.out.println("Phone 1: number = " + phone1.number + ", model = " + phone1.model + ", weight = " + phone1.weight + " g");
        System.out.println("Phone 2: number = " + phone2.number + ", model = " + phone2.model + ", weight = " + phone2.weight + " g");
        System.out.println("Phone 3: number = " + phone3.number + ", model = " + phone3.model + ", weight = " + phone3.weight + " g");

        phone1.receiveCall("Mother");
        System.out.println("Phone number 1: " + phone1.getNumber());

        phone2.receiveCall("Oleh");
        System.out.println("Phone number 2: " + phone2.getNumber());

        phone3.receiveCall("Teacher");
        System.out.println("Phone number 3: " + phone3.getNumber());

        phone2.receiveCall("Oleh", "063-999-88-77");

        System.out.print("Sending messages to numbers: ");
        phone1.sendMessage("099-123-45-67", "098-765-43-21", "073-111-22-33");
    }
}

class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
        this.number = "Not specified";
        this.model = "Not specified";
        this.weight = 0.0;
    }

    public void receiveCall(String callerName) {
        System.out.println("Calling " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Calling " + callerName + " from number " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}