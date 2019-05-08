import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the annual interest rate: ");
	    double interest = input.nextDouble();

        System.out.print("What is the starting balance: ");
        double tempBalance = input.nextDouble();

        System.out.print("How many months have the account been open: ");
        int accOpened = input.nextInt();

        SavingsAccount saving = new SavingsAccount(tempBalance);

        for (int i = 0; i < accOpened; i++) {
            System.out.print("How much was deposited into the account during " + i + " months? ");
            double depAmount = input.nextInt();
            saving.deposit(depAmount);

            System.out.print("How much was withdrawn from the account during " + i + " months? ");
            double witAmmount = input.nextInt();
            saving.withdrawal(witAmmount);

            System.out.println("Your total interest for " + i + " months is: " + saving.interest(interest)
                                 + "your total is: " + saving(tempBalance));

        }

    }
}
