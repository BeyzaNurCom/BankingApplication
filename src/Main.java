import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        bank.addAccount(new SavingsAccount(1001, "Ahmet Yilmaz", 5000));
        bank.addAccount(new CheckingAccount(1002, "Ayse Demir", 3000));

        int choice;

        do {
            System.out.println();
            System.out.println("1. Tum hesaplari goster");
            System.out.println("2. Hesap bul");
            System.out.println("3. Para yatir");
            System.out.println("4. Para cek");
            System.out.println("5. Yeni hesap ekle");
            System.out.println("0. Cikis");
            System.out.print("Seciminiz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bank.showAllAccounts();
                    break;

                case 2:
                    System.out.print("Hesap numarasi: ");
                    int findNumber = scanner.nextInt();
                    Account found = bank.findAccount(findNumber);

                    if (found != null) {
                        found.showAccountType();
                        found.showInfo();
                    } else {
                        System.out.println("Hesap bulunamadi.");
                    }
                    break;

                case 3:
                    System.out.print("Hesap numarasi: ");
                    int depositNumber = scanner.nextInt();
                    Account depositAccount = bank.findAccount(depositNumber);

                    if (depositAccount != null) {
                        System.out.print("Yatirilacak tutar: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Hesap bulunamadi.");
                    }
                    break;

                case 4:
                    System.out.print("Hesap numarasi: ");
                    int withdrawNumber = scanner.nextInt();
                    Account withdrawAccount = bank.findAccount(withdrawNumber);

                    if (withdrawAccount != null) {
                        System.out.print("Cekilecek tutar: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Hesap bulunamadi.");
                    }
                    break;

                case 5:
                    System.out.print("Hesap numarasi: ");
                    int newNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Musteri adi: ");
                    String newName = scanner.nextLine();

                    System.out.print("Baslangic bakiyesi: ");
                    double newBalance = scanner.nextDouble();

                    System.out.println("Hesap turu secin:");
                    System.out.println("1. Vadeli Hesap");
                    System.out.println("2. Vadesiz Hesap");
                    System.out.print("Secim: ");
                    int typeChoice = scanner.nextInt();

                    Account newAccount;

                    if (typeChoice == 1) {
                        newAccount = new SavingsAccount(newNumber, newName, newBalance);
                        bank.addAccount(newAccount);
                    } else if (typeChoice == 2) {
                        newAccount = new CheckingAccount(newNumber, newName, newBalance);
                        bank.addAccount(newAccount);
                    } else {
                        System.out.println("Gecersiz hesap turu.");
                    }
                    break;

                case 0:
                    System.out.println("Programdan cikiliyor.");
                    break;

                default:
                    System.out.println("Gecersiz secim.");
            }
        } while (choice != 0);

        scanner.close();
    }
}