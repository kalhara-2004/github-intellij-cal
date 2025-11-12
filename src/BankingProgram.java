 import java.util.Scanner;

    public class BankingProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double balance=0;
            boolean isRunning = true;
            int choice;

            while (isRunning) {
                System.out.println("***************");
                System.out.println("Banking Program");
                System.out.println("***************");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("***************");

                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                switch(choice){
                    case 1 -> showBalance(balance);
                    case 2 -> balance = deposit(balance);
                    case 3 -> balance = withdraw(balance);
                    case 4 -> isRunning = false;
                    default -> System.out.println("Invalid choice");

                }
            }

        }
        static void showBalance(double balance){
            System.out.printf("$%.2f\n",balance);
        }
        static double deposit(double balance){
            Scanner scanner = new Scanner(System.in);
            double amount;
            System.out.print("Enter amount to deposit: ");
            amount = scanner.nextDouble();
            if(amount < 0){
                System.out.println("Invalid amount");
                return balance;
            }else {
                return amount+balance;
            }
        }
        static double withdraw(double balance){
            Scanner scanner = new Scanner(System.in);
            double amount;
            System.out.print("Enter amount to withdraw: ");
            amount = scanner.nextDouble();
            if(amount < 0){
                System.out.println("Invalid amount");
                return balance;
            }else{
                if(amount > balance){
                    System.out.println("Insufficient balance");
                    return balance;
                }else {
                    return balance-amount;
                }
            }
        }
    }

