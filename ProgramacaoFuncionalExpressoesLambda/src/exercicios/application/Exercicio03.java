package exercicios.application;

import exercicios.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        // Exercicio 03) Predicate – Filtros
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 1900.0));
        list.add(new Product("Celular", 2500.0));
        list.add(new Product("PS5", 3000.0));
        list.add(new Product("Apple Watch 4", 800.0));
        list.add(new Product("Fone de ouvido", 50.0));
        list.add(new Product("Carregador", 35.0));

        list.removeIf(prod -> prod.getPrice() < 100.0);
        for (Product prod : list) {
            System.out.println(prod);
        }
    }
}
