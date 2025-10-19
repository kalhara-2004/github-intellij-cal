import java.util.Scanner;

public class ifState {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int age;
         String name;
         boolean isStudent;

         System.out.print("Enter your name :");
         name = scanner.nextLine();

         System.out.print("Enter your age :");
         age = scanner.nextInt();

        System.out.print("Are you a student ? (true / false) :");
        isStudent = scanner.nextBoolean();

        System.out.print("\nHello Mr."+name+"\n");

         if(age <= 0){
             System.out.println("Enter correct age 😡");
         }else if (age < 18){
             System.out.println("You are a child ! 😂");
         }else if (age >=18 && age < 65 ){
             System.out.println("You are an adult 👨‍🦱");
         }else if (age>= 65){
             System.out.println("You are senior !! 👨‍🦳");
         }

        if (isStudent){
            System.out.println("And you are a student");
        }else {
            System.out.println("And you are not a student");
        }



        scanner.close();

    }
}
