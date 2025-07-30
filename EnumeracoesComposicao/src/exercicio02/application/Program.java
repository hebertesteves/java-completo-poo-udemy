package exercicio02.application;

import exercicio02.entities.Comment;
import exercicio02.entities.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fmt1),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        p1.addComent(c1);
        p1.addComent(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", fmt1),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComent(c3);
        p2.addComent(c4);

        System.out.println(p1);
        System.out.println(p2);

        sc.close();
    }
}
