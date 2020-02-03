import java.util.*;

public class NewAccounts {
		public static Scanner input = new Scanner(System.in);
		
		public static void main(String[] args) {
        
			Account[] accounts = new Account[10];
			for (int i = 0; i < 10; i++) {
				accounts[i] = new Account(i, 100.0);
        }

        System.out.print("Enter an id ranging from 1 -10: ");
        int id = input.nextInt();
        
        if (id < 1 || id > 10) {
            id = incorrectId(id);
        }
        boolean flag = false;
        while (!flag) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id (1 - 10): ");
                id = input.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, accounts);
        }
    }

    public static int incorrectId(int id) {
        while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");
            id = input.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void performChoice(int id, int choice, Account[] accounts) {
        //Scanner in = new Scanner(System.in);
        switch (choice) {
            case 1: 
                System.out.printf("The balance is: "+
                                 accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id - 1].deposit(input.nextDouble());
                break;
            default:
                break;
        }
        System.out.print("\n");
    }

    public static void menuDisplay() {
        System.out.printf("%nMain menu%n");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}
