public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void addBalance(double amount) {
        balance = balance + amount;

    }

    public void withDraw(double amount) {
        balance = balance - amount;
    }

    public void display() {
        System.out.print("balance= " + balance);
    }

}