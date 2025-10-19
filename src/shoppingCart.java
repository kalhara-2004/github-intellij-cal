import  java.util.Scanner;


public class shoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? :");
        item = scanner.nextLine();

        System.out.print("What is the price for each  :");
        price = scanner.nextDouble();

        System.out.print("How many would you buy? :");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.print("\nYou want to buy "+quantity+" "+item);
        System.out.print("\nHere is the total price for "+quantity+" "+item+" : "+currency+" "+total+"\n\n");


        scanner.close();
    }
}
