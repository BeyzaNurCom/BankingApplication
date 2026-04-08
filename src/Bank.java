public class Bank {
    private Account[] accounts;
    private int count;

    public Bank() {
        accounts = new Account[10];
        count = 0;
    }

    public void addAccount(Account account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
            System.out.println("Hesap eklendi: " + account.getOwnerName());
        } else {
            System.out.println("Banka hesap kapasitesi dolu.");
        }
    }

    public Account findAccount(int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    public void showAllAccounts() {
        if (count == 0) {
            System.out.println("Kayitli hesap yok.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("--------------------");
            accounts[i].showAccountType();
            accounts[i].showInfo();
        }
    }
}