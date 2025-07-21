import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount currentAccount = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Mini Bank System Menu ===");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account name: ");
                    scanner.nextLine(); // consume leftover newline
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();

                    currentAccount = new BankAccount(name, number, balance);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    if (currentAccount == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                    }
                    break;

                case 3:
                    if (currentAccount == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                    }
                    break;

                case 4:
                    if (currentAccount == null) {
                        System.out.println("No account found. Please create an account first.");
                    } else {
                        currentAccount.showAccountInfo();
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-5.");
            }

        }

        scanner.close();
    }
}
