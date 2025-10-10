package exercicios.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio04 {
    public static void main(String[] args) {
        // Exercicio 04) Consumer – Ações
        List<String> list = new ArrayList<>(Arrays.asList("narutO", "Boruto", "saSuke", "KaKashi"));

        Consumer<String> consumer = (name) -> {
            System.out.println(name.toUpperCase());
        };
        list.forEach(consumer);
    }
}
