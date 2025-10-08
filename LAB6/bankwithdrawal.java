public class BankWithdrawalDemo {

    // Inner class for BankAccount
    static class BankAccount {
        private int balance = 1000;

        // Synchronized method to make withdrawals thread-safe
        public synchronized void withdraw(int amount, String person) {
            System.out.println("[DEBUG] Current balance before " + person + "'s withdrawal: ₹" + balance);
            if (balance >= amount) {
                System.out.println(person + " is trying to withdraw ₹" + amount);
                try {
                    Thread.sleep(100); // Simulate delay
                } catch (InterruptedException e) {
                    System.out.println("[ERROR] " + person + "'s withdrawal interrupted.");
                    e.printStackTrace();
                }
                balance -= amount;
                System.out.println(person + " completed withdrawal. Remaining balance: ₹" + balance);
            } else {
                System.out.println(person + " tried to withdraw ₹" + amount + " but insufficient balance.");
            }
            System.out.println("[DEBUG] Balance after " + person + "'s attempt: ₹" + balance);
        }

        public int getBalance() {
            return balance;
        }
    }

    // Inner class for WithdrawalThread
    static class WithdrawalThread extends Thread {
        private BankAccount account;
        private String person;

        public WithdrawalThread(BankAccount account, String person) {
            this.account = account;
            this.person = person;
        }

        @Override
        public void run() {
            System.out.println("[DEBUG] " + person + " thread started.");
            account.withdraw(700, person);
            System.out.println("[DEBUG] " + person + " thread finished.");
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawalThread person1 = new WithdrawalThread(account, "Alice");
        WithdrawalThread person2 = new WithdrawalThread(account, "Bob");

        System.out.println("[DEBUG] Starting both withdrawal threads...");
        person1.start();
        person2.start();

        try {
            person1.join();
            person2.join();
        } catch (InterruptedException e) {
            System.out.println("[ERROR] Main thread interrupted.");
            e.printStackTrace();
        }

        System.out.println("[DEBUG] Final balance: ₹" + account.getBalance());
    }
}
