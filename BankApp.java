public abstract class BankApp {
    protected String accNo;
    protected double bal;

    public BankApp(String accNo, double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }

    public void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (bal >= amount) {
            bal -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return bal;
    }

    public abstract double calculateInterest();

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S1001", 5050);
        CheckingAccount checking = new CheckingAccount("C2201", 3090);

        savings.deposit(10101);
        savings.withdraw(500);
        System.out.println("Savings Interest: " + savings.calculateInterest());

        checking.deposit(500);
        checking.withdraw(1000);
        System.out.println("Checking Interest: " + checking.calculateInterest());
    }
}

class SavingsAccount extends BankApp {
    private final double interestRate = 0.04;

    public SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return bal * interestRate;
    }
}

class CheckingAccount extends BankApp{
    private final double interestRate = 0.01;

    public CheckingAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return bal * interestRate;
    }
}