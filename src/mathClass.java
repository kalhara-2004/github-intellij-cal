import java.util.Scanner;

public class mathClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A :");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B :");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("\n "+c+" cm");

        scanner.close();
        /* System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5);
        result = Math.sqrt(16);
        result = Math.round(4.55);
        result = Math.ceil(3.14);
        result = Math.floor(6.74);
        result = Math.min(32 , 54);
        result = Math.max(199 , 24);

        System.out.println(result);

         */



    }
}
