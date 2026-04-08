public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("Hesap Turu: Vadeli Hesap");
    }
}