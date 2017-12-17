package lesson3;

import java.util.ArrayList;

import static java.lang.Character.isLetter;

public class MovieService {
    String movieName;

    public static void greeting() {
        System.out.println("Welcome to Guess the Movie!");
        System.out.println("The rules are simple, the computer randomly picks a movie title, and shows you how " +
                "many " + "letters it's made up of.");
        System.out.println("Your goal is to try to figure out the movie by guessing one letter at a time.");
        System.out.println("If a letter is indeed in the title the computer will reveal its correct position in" +
                " the " + "word, if not, you lose a point.");
        System.out.println("If you lose 10 points, game over!");
        System.out.println("Let's start!");
    }

    public static String getUndersoredMovieName(String movieName) {
        String underscoredName = "";
        for (int i = 0; i < movieName.length()-1; i++) {
            if (isLetter(movieName.charAt(i)))
                underscoredName += "_ ";
        }
        return  "You are guessing: " + underscoredName;
    }

    public static Integer[] getCharIndices(Character c, String movieName) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < movieName.length()-1; i++) {
            if (movieName.charAt(i) == c) {
                indices.add(i);
                count++;
            }
        }
        return (Integer[]) indices.toArray();
    }
}
