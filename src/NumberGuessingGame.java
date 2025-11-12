import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min =1;
        int max =100;
        int randomNumber = rand.nextInt(min,max);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d and %d",min,max);

        do{
            System.out.print("Enter Guessing Number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low! Try again");
            }else{
                System.out.println("Too high! Try again");
            }

        }while(guess != randomNumber);

        System.out.println("You have won");
        System.out.println("Attempts: "+attempts);
    }
}