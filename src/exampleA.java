import java.util.Comparator;

final class NameAscComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.name().compareTo(b.name());
    }
}

final class Product {
    private final String name;
    private final double price;
    private final double rating;

    public Product(String name, double price, double rating) {
        this.name = name; this.price = price; this.rating = rating;
    }
    public String name() { return name; }
    public double price() { return price; }
    public double rating() { return rating; }

    @Override public String toString() {
        return name + " (€" + price + ", " + rating + "★)";
    }
}

class DemoComparatorA {
    public static void main(String[] args) {
        var items = new java.util.ArrayList<Product>();
        items.add(new Product("Mouse", 15.0, 4.2));
        items.add(new Product("Keyboard", 45.0, 4.5));
        items.add(new Product("Monitor", 120.0, 4.1));

        items.sort(new NameAscComparator());
        System.out.println(items);
    }
}