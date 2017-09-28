package lesson2;

import java.util.Scanner;
import java.io.File;

public class FileReader {

    public static  void main(String[] args) throws Exception {
        File file = new File("The Mysterious Island by J.Vern.txt");
        Scanner sc = new Scanner(file);

        Integer numOfWords = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            numOfWords += line.split(" ").length;
        }
        System.out.println("This book has " + numOfWords + " words");
    }
}
