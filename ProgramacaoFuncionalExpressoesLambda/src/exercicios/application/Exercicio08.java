package exercicios.application;

import exercicios.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio08 {
    public static void main(String[] args) {
        // Exercicio 08) Exercício combinado (todos juntos)
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 1900.0));
        list.add(new Product("Celular", 2500.0));
        list.add(new Product("PS5", 3000.0));
        list.add(new Product("Apple Watch 4", 800.0));
        list.add(new Product("Fone de ouvido", 50.0));
        list.add(new Product("Carregador", 35.0));

        list.removeIf(prod -> prod.getPrice() < 50.0);

        list.forEach(prod -> prod.setPrice(prod.getPrice() * 1.2));

        List<String> listName = list.stream().map(prod -> prod.getName().toUpperCase()).collect(Collectors.toList());

        listName.sort((p1, p2) -> -p1.compareTo(p2));

        listName.forEach(System.out::println);
    }
}
