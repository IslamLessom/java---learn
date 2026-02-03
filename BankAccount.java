class BankAccounts {
    static class BankAccount {
        private int balance;

        BankAccount(int balance) {
            this.balance = balance;
        }

        void deposit(int amount) {
            balance += amount;
        }

        void withdraw(int amount) {
            if (balance >= amount) {
                balance -= amount;
            }
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500);

        acc.deposit(100);
        acc.withdraw(50);

        System.out.println("Balance - " + acc.getBalance());

    }
}
