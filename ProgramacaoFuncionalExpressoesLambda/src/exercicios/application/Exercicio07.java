package exercicios.application;

import exercicios.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Exercicio07 {
    public static void main(String[] args) {
        // Exercicio 07) Function – Transformações
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 1900.0));
        list.add(new Product("Celular", 2500.0));
        list.add(new Product("PS5", 3000.0));
        list.add(new Product("Apple Watch 4", 800.0));
        list.add(new Product("Fone de ouvido", 50.0));
        list.add(new Product("Carregador", 35.0));

        Function<Product, String> function = (prod) -> prod.getName().toUpperCase();

        //List<String> listNames = list.stream().map(function).toList();
        List<String> listNames = list.stream().map(prod -> prod.getName().toUpperCase()).toList();

        listNames.forEach(System.out::println);
    }
}
