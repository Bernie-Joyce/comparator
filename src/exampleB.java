class DemoComparatorB {
    public static void main(String[] args) {
        var items = new java.util.ArrayList<Product>();
        items.add(new Product("Mouse", 15.0, 4.2));
        items.add(new Product("Keyboard", 45.0, 4.5));
        items.add(new Product("Monitor", 120.0, 4.1));

        java.util.Comparator<Product> priceAsc = new java.util.Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return Double.compare(a.price(), b.price());
            }
        };

        items.sort(priceAsc);
        System.out.println(items);
    }
}