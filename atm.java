import java.util.*;

class atmMachine {
    float Balance;
    int pin = 5465;

    public void checkpin() {
        System.out.println("Enter your Pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin");

        }

    }

    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check A/c balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            checkbalance();

        } else if (option == 2) {
            withdraw();

        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("enter valid choice");
            menu();
        }

    }

    public void checkbalance() {
        System.out.println("Available balance are" + Balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter amount you want to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");

        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawl succesfully");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited succcesfully");
        menu();
    }

}

public class atm {
    public static void main(String[] args) {
        atmMachine obj = new atmMachine();
        obj.checkpin();
    }
}