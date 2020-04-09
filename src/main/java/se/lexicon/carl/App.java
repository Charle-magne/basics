package se.lexicon.carl;
import java.util.Scanner;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  printName();
      //  secondsToHours();
      //  leapYear();
      //  twoNumbers();
      //  avgThreeNumbers();
      //  returnName();
        randomNumberGuess();
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void printName(){

        System.out.println("Hello");
        System.out.println("Carl!");
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void leapYear(){

        Scanner input = new Scanner(System.in);
        System.out.println("This is the Leap Year checker.");
        System.out.println("Enter year to check:");
        int inputYear = input.nextInt();

        if (inputYear % 400 == 0){
            System.out.println("That's a leap year.");
        }
        else if (inputYear % 100 == 0){
            System.out.println("Even, but not a leap year.");
        }
        else if (inputYear % 4 == 0){
            System.out.println("That's a common leap year.");
        }
        else {
            System.out.println("That's not a leap year.");
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void twoNumbers(){

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number:");
        double numOne = input.nextInt();
        System.out.println("Input the second number:");
        double numTwo = input.nextInt();

        System.out.println("Addition: " + (numOne + numTwo));
        System.out.println("Subraction: " + (numOne - numTwo));
        System.out.println("Multiplication: " + (numOne * numTwo));
        System.out.println("Division: " + (numOne/numTwo));
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void avgThreeNumbers(){

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number:");
        double numOne = input.nextInt();
        System.out.println("Input the second number:");
        double numTwo = input.nextInt();
        System.out.println("Input the third number:");
        double numThree = input.nextInt();

        System.out.println("The average is " + (numOne + numTwo + numThree)/3);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void returnName(){

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = input.next();

        System.out.println("Hello" + name); // This won't take more than one word, sadly.
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void secondsToHours(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seconds you wish to convert:");
        int inputSeconds = input.nextInt();

        int hourExcess = inputSeconds % 3600;
        int hours = (inputSeconds - hourExcess)/3600;
        int seconds = hourExcess % 60;
        int minutes = (hourExcess - seconds)/60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
//----------------------------------------------------------------------------------------------------------------------
    public static void randomNumberGuess(){

        Random rnd = new Random();
        int targetNumber = (rnd.nextInt(500)+1);

        Scanner input = new Scanner(System.in);
        boolean wrongGuess = true;
        int numberOfGuesses = 0;

        do {
            System.out.println("Guess the number (between 1 and 500):");
            int guess = input.nextInt();
            numberOfGuesses++;

            if (guess == targetNumber){
                System.out.println("Congratulations, " + targetNumber + " was the right answer! It took " + numberOfGuesses + " guesses to get here.");
                wrongGuess = false;
            }
            else if (guess < targetNumber){
                System.out.println("Too low, try again. You've guessed " + numberOfGuesses + " time(s).");
            }
            else {
                System.out.println("Too high, try again. You've guessed " + numberOfGuesses + " time(s).");
            }
        } while (wrongGuess);

    }

}
