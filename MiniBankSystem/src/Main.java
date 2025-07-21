import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "12345", 1000.0);
        BankAccount account2 = new BankAccount("Bob", "67890", 500.0);

        System.out.println("Account 1 details:");
        account1.showAccountInfo();

        System.out.println("\nAccount 2 details:");
        account2.showAccountInfo();
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Create a new account selected.");
                    break;
                case 2:
                    System.out.println("Deposit money selected.");
                    break;
                case 3:
                    System.out.println("Withdraw money selected.");
                    break;
                case 4:
                    System.out.println("View account details selected.");
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
