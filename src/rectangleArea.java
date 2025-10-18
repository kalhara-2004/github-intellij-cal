import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Hight :");
        double hight = scanner.nextDouble();

        System.out.print("Enter the Length :");
        double length = scanner.nextDouble();

        double area = hight * length;

        System.out.println("The area for your inputs :"+area);


 scanner.close();
    }
}