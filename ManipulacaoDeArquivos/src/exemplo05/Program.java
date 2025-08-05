package exemplo05;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String srtPath = sc.nextLine();

        File path = new File(srtPath);

        File[] folders = path.listFiles(File::isDirectory);
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(srtPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        sc.close();
    }
}
