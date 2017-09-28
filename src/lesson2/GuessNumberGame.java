package lesson2;
import java.util.*;

public class GuessNumberGame {
     public static void main (String[] args) {
         int randomNum = (int) (Math.random()*100)+1;
         System.out.println("I have randomly chosen a number between 1 and 100");
         System.out.println("Try to guess it");

         boolean hasWon = false;
         Scanner sc = new Scanner(System.in);
         for (int i = 10; i>0; i--) {
             System.out.println("You have " + i + " attempts left." );
             int guess = sc.nextInt();

             if (guess < randomNum) {
                 System.out.println("Your number is smaller than the answer. Choose again!");
             } else if (guess > randomNum) {
                 System.out.println("Your number is bigger than the answer Choose again!");
             } else {
                 hasWon = true;
                 break;
             }
         }
         if (hasWon) {
             System.out.println("You WIN. Congrats!!!");
         } else {
             System.out.println("You LOSE! The answer was " + randomNum);
         }
     }
}
