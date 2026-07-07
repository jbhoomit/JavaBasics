public class BankAccountTask {
    public class BankAccount {

        public static final double MIN_BALANCE = 1000;


        private final int accountNumber;
        private final String accountHolder;

        private double balance;

        public BankAccount(int accountNumber, String accountHolder, double balance) {

            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;

            if (balance >= MIN_BALANCE) {
                this.balance = balance;
            } else {
                System.out.println("Minimum balance should be " + MIN_BALANCE);
                this.balance = MIN_BALANCE;
            }
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Amount Deposited: " + amount);
            } else {
                System.out.println("Invalid Deposit Amount");
            }
        }


        public void withdraw(double amount) {
            if (balance - amount >= MIN_BALANCE) {
                balance = balance - amount;
                System.out.println("Amount Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance");
            }
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void display() {
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Holder : " + accountHolder);
            System.out.println("Balance : " + balance);
        }

        public  void main(String[] args) {

            BankAccount b1 = new BankAccount(1010, "bhoomit jain", 500000000);

            b1.display();

            b1.deposit(2000);

            b1.withdraw(1500);

            System.out.println("Final Details:");
            b1.display();
        }
    }
}
