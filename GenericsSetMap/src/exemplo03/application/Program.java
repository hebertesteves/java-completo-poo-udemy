package exemplo03.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();

        // myObjs = myNumbers; -> erro de compilação

        List<?> myObj = new ArrayList<>(); // tipo curinga
        myObj = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    public static void printList(List<?> list) {
        // list.add(3); -> erro, não pode adicionar em coleção do tipo curinga
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
