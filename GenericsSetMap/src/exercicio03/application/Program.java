package exercicio03.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> votes = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);
                
                if (votes.containsKey(name)) {
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                } else {
                    votes.put(name, count);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
