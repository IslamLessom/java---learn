class BankAccounts {
    static class BankAccount {
        private int balance;

        BankAccount(int balance) {
            this.balance = balance;
        }

        void plus(int num) {
            balance += num;
        }

        void minus(int num) {
            balance -= num;
        }

        int getBalance() {
            return balance;
        }
    }

    static void main(String[] args) {
        BankAccount acc = new BankAccount(500);
        acc.plus(500);
        acc.minus(100);
        System.out.println(acc.getBalance());
    }
}
