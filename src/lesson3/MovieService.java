package lesson3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class MovieService {

    public static String getRandomMovieTitle(File moviesFile, Integer index) throws Exception {
        ArrayList<String> moviesArray = new ArrayList<String>();
        Scanner sc = new Scanner(moviesFile);
        while (sc.hasNextLine()) {
            String nextTitle = sc.nextLine();
            moviesArray.add(nextTitle);
        }
        return moviesArray.get(index);

    }

}
