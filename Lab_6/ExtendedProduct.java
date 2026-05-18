public class ExtendedProduct extends Product {
    String category;
    String manufacturer;

    public ExtendedProduct() {
        super();
        this.category = "Not specified";
        this.manufacturer = "Not specified";
    }

    public ExtendedProduct(String name, double price, int warrantyTerm, String category, String manufacturer) {
        super(name, price, warrantyTerm);
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public void input(String name, double price, int warrantyTerm, String category, String manufacturer) {
        super.input(name, price, warrantyTerm);
        this.category = category;
        this.manufacturer = manufacturer;
    }

    @Override
    public void printInfo() {
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price + " UAH");
        System.out.println("Warranty term: " + warrantyTerm + " months");
        System.out.println("Product category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
    }
}