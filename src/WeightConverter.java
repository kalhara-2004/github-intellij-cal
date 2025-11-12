import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Converter Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight is %.2fkg",newWeight);
        }else if(choice == 2){
            System.out.println("Enter the weight in kg");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight is %.2f lbs",newWeight);
        }else{
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}