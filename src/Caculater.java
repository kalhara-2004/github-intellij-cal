import java.util.Scanner;

public class Caculater {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount :");
        principal=scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) :");
        rate=scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year :");
        timesCompounded=scanner.nextInt();

        System.out.print("Enter the # of years for compounded per year :");
        years=scanner.nextInt();

        amount = principal* Math.pow(1 + rate/timesCompounded, timesCompounded * years)    ;

        System.out.printf("%nThe total amount after %d compounded per year is $%.2f%n%n",timesCompounded,amount);

        scanner.close();

    }

}
