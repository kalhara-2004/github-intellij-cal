import java.util.Scanner;


public class userInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = scanner.nextLine();

        System.out.print("Enter your age :");
        int age = scanner.nextInt();

        System.out.print("What is your GPA :");
        double gpa = scanner.nextDouble();

        System.out.print("Are you pass (True/False) :");
        boolean isPass = scanner.nextBoolean();

        if(isPass){
            System.out.println("\nYou can Enroll the cousre\n\nHere the details :");
        }else{
            System.out.println("\nYou can not Enroll the cousre\n\nHere the details :");
        }


        System.out.println("Hello Mr."+name+" You are "+age+" years old and GPA is "+gpa);
        System.out.println("Pass/Fail status :"+isPass);



        scanner.close();
    }
}
