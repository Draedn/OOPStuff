/*

TITLE: GuessNumero
AUTHOR: Draedn Groves
DATE: Jan.26th/2024
PURPOSE: Creating a simple game.

*/
import javax.tools.Tool;
// main class where the application starts
public class Main {
    // global variables
    static int correctNumber;
    static final int MIN_NUM = 1, MAX_NUM = 100;

    // main method to start the application
    public static void main(String[] args) {
        initializeGame();
        runGame();
        closeGame();
    }
    // initial game setup
    private static void initializeGame() {
        System.out.println("Welcome to our Guess the Number console game");
        System.out.println("********************************************");
        System.out.println("I have randomized a number between " + MIN_NUM + " and " + MAX_NUM + "!");
        System.out.println("Can you guess the number?");

        correctNumber = Tools.genRandomInt(MIN_NUM, MAX_NUM);
//        System.out.println("A random number is " + correctNumber);
    }
    // run the GTN game
    private static void runGame() {
//      int guessedNumber = Tools.getIntFromConsole("Please enter a positive number!");
        int guessedNumber = Tools.getIntFromConsole("Take a guess at the number!" , MIN_NUM, MAX_NUM);
//      System.out.println("Random number: " + correctNumber + " - your guess: " + guessedNumber);
        while (guessedNumber != correctNumber){
            System.out.println("That's not the right number! Guess again.. ");
            guessedNumber = Tools.getIntFromConsole("Take another guess! " , MIN_NUM, MAX_NUM);
            if(guessedNumber < correctNumber){
                System.out.println("That's too low... ");

            }else{
                System.out.println("That's too high! ");
            }


        }
        System.out.println("You got it!");
    }
    // close the game
    private static void closeGame() {
        System.out.println("Thanks for playing! :D ");
    }
}