
package interfaceabstract;

public class Account extends BankAccAbstract {
    private static double bagihasil = 0.1;

    public Account(String name, String num, int amt) {
        super(name, num, ((int) Account.calculateBonus(amt) + amt));
    }

    private static double calculateBonus(int amt) {
        return bagihasil * amt;
    }

    @Override
    public void deposit(int amt) {
        this.balance += amt;
    }

    @Override
    public void withdraw(int amt) {
        this.balance -= amt;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String getBankName() {
        return this.BANK;
    }

    public void print() {
        System.out.println("Bank Name: " + this.getBankName()
                + "\nAccount Name: " + this.accountName
                + "\nAccount Number: " + this.accountNum
                + "\nBalance: " + this.balance);
    }

}
