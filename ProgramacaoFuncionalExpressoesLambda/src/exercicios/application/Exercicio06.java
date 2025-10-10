package exercicios.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercicio06 {
    public static void main(String[] args) {
        // Exercicio 06) Function – Transformações
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Function<Integer, Integer> function = (n) -> n * n;

        List<Integer> listQuadrado = list.stream().map(function).toList();
        listQuadrado.forEach(System.out::println);
    }
}
