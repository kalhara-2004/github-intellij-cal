import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total=0;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice >0){
            for (int i = 1; i <= numOfDice; i++) {
                int roll = random.nextInt(1,7);
                printDice(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);

        }else{
            System.out.println("# of dice can't be negative");
        }

    }
    static void printDice(int num){
        String dice1 = """
                 _______
                |       |
                |   •   |
                |       |
                 ------- 
                """;
        String dice2 = """
                 _______
                | •     |
                |       |
                |     • |
                 -------
               """;
        String dice3 = """
                 _______
                | •     |
                |   •   |
                |     • |
                 ------- 
                """;
        String dice4 = """
                 _______
                | •   • |
                |       |
                | •   • |
                 ------- 
                """;
        String dice5 = """
                 _______
                | •   • |
                |   •   |
                | •   • |
                 ------- 
                """;
        String dice6 = """
                 _______
                | •   • |
                | •   • |
                | •   • |
                 ------- 
                """;
        switch (num){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default ->  System.out.println("Invalid Input");
        }
    }
}