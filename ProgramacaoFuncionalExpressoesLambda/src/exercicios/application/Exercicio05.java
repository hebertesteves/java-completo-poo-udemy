package exercicios.application;

import exercicios.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio05 {
    public static void main(String[] args) {
        // Exercicio 05) Consumer – Ações
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 1900.0));
        list.add(new Product("Celular", 2500.0));
        list.add(new Product("PS5", 3000.0));
        list.add(new Product("Apple Watch 4", 800.0));
        list.add(new Product("Fone de ouvido", 50.0));
        list.add(new Product("Carregador", 35.0));

        Consumer<Product> consumer = (prod) -> {
          prod.setPrice(prod.getPrice() * 0.90);
        };

        list.forEach(consumer);
        list.forEach(System.out::println);
    }
}
