public class Product {
    String name;
    double price;
    int warrantyTerm;

    public Product() {
        this.name = "Not specified";
        this.price = 0.0;
        this.warrantyTerm = 0;
    }

    public Product(String name, double price, int warrantyTerm) {
        this.name = name;
        this.price = price;
        this.warrantyTerm = warrantyTerm;
    }

    public void input(String name, double price, int warrantyTerm) {
        this.name = name;
        this.price = price;
        this.warrantyTerm = warrantyTerm;
    }

    public void printInfo() {
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price + " UAH");
        System.out.println("Warranty term: " + warrantyTerm + " months");
    }

    public void reducePriceBy50() {
        price = price / 2;
    }
}