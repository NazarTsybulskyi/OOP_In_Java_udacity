package lesson3;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.math.*;

import static java.lang.Math.*;

public class GuessTheMovies {
    public static void main (String[] args) throws Exception{
        File f = new File("MoviesList.txt");
        Scanner sc = new Scanner(f);
        String line = sc.nextLine();
        String[] movTitles = line.split(",");
        //System.out.println(Arrays.toString(movTitles));
        int movNumber = (int) (Math.random()*10);
        //System.out.println(movNumber);
        String movieName = movTitles[movNumber];
        String movieName_hidden = "";
        for (int i = 0; i < movieName.length(); i++) {
            movieName_hidden += "_ ";
        }
        System.out.println(movieName_hidden);
    }
}
