final class RatingDescThenNameAsc implements java.util.Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        // rating descending
        int byRating = Double.compare(b.rating(), a.rating());
        if (byRating != 0) return byRating;
        // tie-break by name ascending
        return a.name().compareTo(b.name());
    }
}

class DemoComparatorC {
    public static void main(String[] args) {
        var items = new java.util.ArrayList<Product>();
        items.add(new Product("Mouse", 15.0, 4.2));
        items.add(new Product("Keyboard", 45.0, 4.5));
        items.add(new Product("Monitor", 120.0, 4.1));
        items.add(new Product("Mat", 12.0, 4.5)); // same rating as Keyboard

        items.sort(new RatingDescThenNameAsc());
        System.out.println(items);
    }
}