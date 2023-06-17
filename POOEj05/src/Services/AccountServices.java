package Services;

import Entity.Account;

public class AccountServices {

    public Account createAccount(int accountNumber, long clientDni, int currentBalance) {
        Account account = new Account(accountNumber, clientDni, currentBalance);
        return account;
    }

    public void deposit(Account account, double depositValue) {
        int currentBalance = account.getCurrentBalance();
        currentBalance = currentBalance + (int) depositValue;
        account.setCurrentBalance(currentBalance);
    }

    public void withdraw(Account account, double withdrawValue) {
        int currentBalance = account.getCurrentBalance();
        currentBalance = currentBalance - (int) withdrawValue;
        if (currentBalance < 0) {
            currentBalance = 0;
        }
        account.setCurrentBalance(currentBalance);
    }

    public void fastWithdraw(Account account) {
        int currentBalance = account.getCurrentBalance();
        currentBalance = currentBalance - (int) (currentBalance * 0.2);
    }

    public int checkBalance(Account account) {
        int ret = account.getCurrentBalance();
        return ret;
    }

    public String checkData(Account account) {
        int accountNumber = account.getAccountNumber();
        long clientDni = account.getClientDni();
        int currentBalance = account.getCurrentBalance();
        String ret = "Account number: " + accountNumber + "\nDNI: " + clientDni + "\nCurrent balance = "
                + currentBalance;
        return ret;
    }

}
