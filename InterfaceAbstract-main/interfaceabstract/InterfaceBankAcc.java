
package interfaceabstract;

interface InterfaceBankAcc {
    public final String BANK = "JavaBank Indonesia";

    public void deposit(int amt);

    public void withdraw(int amt);

    public int getBalance();

    public String getBankName();
}
