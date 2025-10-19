import java.util.Scanner;

public class madgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description) :");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person) :");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description) :");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb end with _ing (acting) :");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description) :");
        adjective3 = scanner.nextLine();

        System.out.println("\nYesterday I went to a "+ adjective1 +" zoo");
        System.out.println("And I saw a "+ noun1 +" in a cage.");
        System.out.println(noun1 +" was "+ adjective2 +" and "+ verb1 +" !!");
        System.out.println("I was "+ adjective3 +" !");

        scanner.close();
    }
}
