import java.util.HashMap;

public class TaskTwo {
    public static void taskTwo() {
        System.out.println("Task 2. Phone book");

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Shevchenko", "097-111-22-33");
        phoneBook.put("Kovalenko", "050-444-55-66");
        phoneBook.put("Boiko", "063-777-88-99");
        phoneBook.put("Tkachenko", "099-123-45-67");
        phoneBook.put("Kravchenko", "098-765-43-21");
        phoneBook.put("Oliinyk", "073-111-00-00");
        phoneBook.put("Melnyk", "067-999-11-22");
        phoneBook.put("Lysenko", "066-555-44-33");
        phoneBook.put("Hrytsenko", "093-222-33-44");
        phoneBook.put("Sydorenko", "050-999-88-77");

        System.out.println("\nCurrent phone book:");
        for (String surname : phoneBook.keySet()) {
            System.out.println("Surname: " + surname + ", phone number: " + phoneBook.get(surname));
        }

        System.out.println("\nSearching for Boiko:");

        String searchSurname = "Boiko";

        if (phoneBook.containsKey(searchSurname)) {
            System.out.println("Phone number of " + searchSurname + ": " + phoneBook.get(searchSurname));
        } else {
            System.out.println("There is no such subscriber in the phone book");
        }

        System.out.println("\nSearching for Petrenko:");

        searchSurname = "Petrenko";

        if (phoneBook.containsKey(searchSurname)) {
            System.out.println("Phone number of " + searchSurname + ": " + phoneBook.get(searchSurname));
        } else {
            System.out.println("There is no such subscriber in the phone book");
        }

        System.out.println("\nChecking containsValue:");
        System.out.println("Is there number 073-111-00-00? "
                + phoneBook.containsValue("073-111-00-00"));

        System.out.println("\nRemoving Kovalenko...");
        phoneBook.remove("Kovalenko");

        System.out.println("\nPhone book after removing:");
        for (String surname : phoneBook.keySet()) {
            System.out.println("Surname: " + surname + ", phone number: " + phoneBook.get(surname));
        }

        System.out.println("\nNumber of records in the phone book: " + phoneBook.size());
    }
}