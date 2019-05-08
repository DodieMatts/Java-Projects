public class SavingsAccount {
    double balance;
    double monthlyInterest;

    public SavingsAccount(double balance) {
        this.balance = balance;

    }

    public double deposit(double addAmmount) {
        this.balance += addAmmount;

        return this.balance;
    }

    public double withdrawal(double subtractAmmount) {
        this.balance -= subtractAmmount;

        return this.balance;
    }

    public double interest(double annualInterest) {
        this.monthlyInterest = (annualInterest / 12);

        this.balance = balance + (monthlyInterest * balance);

        return this.balance;
    }
}
    /*public double getBalance(){

        return this.balance;
    }
}
*/