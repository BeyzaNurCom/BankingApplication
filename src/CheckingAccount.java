public class CheckingAccount extends Account {
    public CheckingAccount(int accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void showAccountType() {
        System.out.println("Hesap Turu: Vadesiz Hesap");
    }
}