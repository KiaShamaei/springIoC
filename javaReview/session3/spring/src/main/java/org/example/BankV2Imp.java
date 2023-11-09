package org.example;

public class BankV2Imp implements BankV2{

    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void payment() {
        System.out.println(this.account.getName() + "payment done ...");
    }
}
