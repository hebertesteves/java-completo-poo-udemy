package exercicios.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        // Exercicio 02) Predicate – Filtros
        List<Integer> list = new ArrayList<>(Arrays.asList(0, -2, -3, 5, 10, -100, 15, 20, -1));

        list.removeIf(n -> n < 0);
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
