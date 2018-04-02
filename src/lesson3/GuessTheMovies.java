package lesson3;
import java.util.Scanner;
import java.io.File;

public class GuessTheMovies {
    public static void main (String[] args) throws Exception{
        File file = new File("movies.txt");
        Scanner sc = new Scanner(file);
        Integer index = (int) Math.ceil(Math.random() * 26);
        System.out.println("You're gessing " + MovieService.getRandomMovieTitle(file, index));
    }
}
