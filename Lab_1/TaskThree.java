public class TaskThree {
    public static void taskThree() {
        User[] users = new User[10];

        users[0] = new User(11, 19, "Andriy", "Melnyk", 70.2, 177.0);
        users[1] = new User(12, 23, "Marko", "Lysenko", 82.4, 186.0);
        users[2] = new User(13, 21, "Vladyslav", "Kravchuk", 74.1, 179.3);
        users[3] = new User(14, 24, "Iryna", "Tkachuk", 56.8, 164.2);
        users[4] = new User(15, 20, "Oleksii", "Demchuk", 88.0, 181.5);
        users[5] = new User(16, 22, "Nataliia", "Semeniuk", 61.3, 169.7);
        users[6] = new User(17, 18, "Roman", "Havryliuk", 76.9, 183.1);
        users[7] = new User(18, 25, "Olena", "Petryshyn", 59.5, 167.0);
        users[8] = new User(19, 26, "Denys", "Boiko", 84.6, 180.4);
        users[9] = new User(20, 21, "Svitlana", "Yavorska", 63.2, 162.8);

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.println("Total age: " + totalAge + " years");
        System.out.println("Total weight: " + totalWeight + " kg");
        System.out.println("Total height: " + totalHeight + " cm");
    }
}