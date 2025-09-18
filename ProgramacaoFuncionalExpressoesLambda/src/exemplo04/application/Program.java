package exemplo04.application;

import exemplo04.entities.Product;
import exemplo04.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);

        // list.forEach(new PriceUpdate());
        // list.forEach(Product::staticPriceUpdate);
        // list.forEach(Product::nonStaticPriceUpdate);
        // list.forEach(consumer);
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
