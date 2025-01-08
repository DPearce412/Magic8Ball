import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */

// 1. How to color-code my environment, as M.G. had in hers.



public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {


        // 2. Get the user to enter a question for the magic 8-ball to answer


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is it you would you like to know?");

        String userQuestion = scanner.nextLine();

        // 3. Make a variable and initialize it to a random number.
        // Get random a number from: [0, 1, 2, 3]

        int randNumber = new Random().nextInt(6);
        // What's this called exactly when you're coupling several methods together there?

        // 4. If the random number is 0

        // Tell the user "Yes"

        if (randNumber == 0) {
            System.out.println("Yes");
        }


        // 5. If the random number is 1

        // Tell the user "No"

        if (randNumber == 1) {
            System.out.println("No");
        }


        // 6. If the random number is 2

        // Tell the user a custom response

        if (randNumber == 2) {
            System.out.println("Sorry, ask again another time.");
        }


        // 7. If the random number is 3

        // Tell the user a custom response

        if (randNumber == 3) {
            System.out.println("Decidedly, no.");
        }

        if (randNumber == 4) {
            System.out.println("That's a big maybe.");
        }

        if (randNumber == 5) {
            System.out.println("Looking like it.");
        }

    }


}



