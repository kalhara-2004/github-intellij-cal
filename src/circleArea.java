import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius :");
        double radius = scanner.nextDouble();


         double area = 2 * Math.PI * Math.pow (radius , 2);
            System.out.printf("Area is : %.2f\n" , area );

        double circumference = 2 * Math.PI * radius;
            System.out.printf("Circumference is : %.2f\n" , circumference );


        double volume = (4/3) * Math.PI * Math.pow(radius , 3);
        System.out.printf("Volume is : %.2f\n" ,  volume);


        scanner.close();
    }
}