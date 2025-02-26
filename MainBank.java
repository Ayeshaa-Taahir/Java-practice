public class MainBank {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount myAccount = new BankAccount("123456789", 5000.0);

        // Depositing money
        myAccount.deposit(1500.0);

        // Displaying updated balance
        myAccount.displayBalance();
    }
}

