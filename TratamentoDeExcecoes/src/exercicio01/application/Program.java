package exercicio01.application;

import exercicio01.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Reservation r = new Reservation(1001, LocalDate.parse("20/08/2019", fmt1), LocalDate.parse("22/08/2019", fmt1));
        System.out.println(r);
    }
}
