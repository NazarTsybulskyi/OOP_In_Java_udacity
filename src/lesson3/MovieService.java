package lesson3;

import java.util.ArrayList;

import static java.lang.Character.isLetter;

public class MovieService {
    String movieName;

    public static String getUndersoredMovieName(String movieName) {
        String nameWithoutSpaces = movieName.replaceAll("\\s","");
        String underscName = "";
        for (int i = 0; i < nameWithoutSpaces.length()-1; i++) {
            if (isLetter(nameWithoutSpaces.charAt(i)))
                underscName += "_ ";
        }
        return  underscName;
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
