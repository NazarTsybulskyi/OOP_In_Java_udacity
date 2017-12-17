package lesson3;
import java.util.Scanner;
import java.io.File;

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
        while (!hasWon || pointCounter < 10) {
            System.out.println(movieName_hidden);
            System.out.println("Name one letter. You have " + pointCounter + " points");
            char guess = scanner.next().charAt(0);
            if (MovieService.getCharIndices(guess, movTitles[movNumber]).length > 0) {
                System.out.println("There is letter " + guess + " in this movie title!");
                System.out.println();
            }
        }

    }
}
