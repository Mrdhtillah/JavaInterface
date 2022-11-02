
package interfaceabstract;

public class CreditAcc extends BankAccAbstract {
    private static int creditLimit;

    public CreditAcc(String name, String num, int amt) {
        super(name, num, amt);
        CreditAcc.creditLimit = 100;
    }

    public void print() {
        System.out.println("Bank Name: " + this.getBankName()
                + "\nAccount Name: " + this.accountName
                + "\nAccount Number: " + this.accountNum
                + "\nBalance: " + this.balance
                + "\nCredit Limit: " + CreditAcc.creditLimit);
    }

    @Override
    public void deposit(int amt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getBankName() {
        return this.BANK;
    }

}
