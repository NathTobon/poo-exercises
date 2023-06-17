package Entity;

public class Account {
    private int accountNumber;
    private long clientDni;
    private int currentBalance;

    public Account() {
    }

    public Account(int accountNumber, long clientDni, int currentBalance) {
        this.accountNumber = accountNumber;
        this.clientDni = clientDni;
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getClientDni() {
        return clientDni;
    }

    public void setClientDni(long clientDni) {
        this.clientDni = clientDni;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

}
