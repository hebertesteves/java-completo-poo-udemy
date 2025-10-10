package exercicios.application;

import exercicios.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        // Exercicio 01) Comparator – Ordenação
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 1900.0));
        list.add(new Product("Celular", 2500.0));
        list.add(new Product("PS5", 3000.0));
        list.add(new Product("Apple Watch 4", 800.0));

        Comparator<Product> comparator = (p1, p2) -> {
          return p1.getPrice().compareTo(p2.getPrice());
        };

        //list.sort(new ProductComparator());
        //list.sort(comparator);
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for (Product prod : list) {
            System.out.println(prod);
        }
    }
}
