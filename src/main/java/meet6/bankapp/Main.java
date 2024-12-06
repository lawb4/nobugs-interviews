package meet6.bankapp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account corporate = new Account("1", "n123", AccountType.CORPORATE, 100);
        Account personal = new Account("2", "n456", AccountType.PERSONAL, 20);

        BankApp bankApp = new BankApp(List.of(corporate, personal));
        bankApp.showBalance();
        bankApp.transferTo(personal, 20);
        bankApp.switchActiveAccountTo(personal);
        bankApp.showBalance();
    }
}
