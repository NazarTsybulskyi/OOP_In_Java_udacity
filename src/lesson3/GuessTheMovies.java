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
        String movieName_hidden = MovieService.getUndersoredMovieName(movTitles[movNumber]);

        boolean hasWon = false;
        int pointCounter = 0;
        Scanner scanner = new Scanner(System.in);
        while (!hasWon) {
            System.out.println(movieName_hidden);
            System.out.println("Name one letter. You have " + pointCounter + " points");
            char guess = scanner.next().charAt(0);

        }

    }
}
