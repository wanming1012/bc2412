public class Account {
  private Currency currency;
  private double balance;

  public Account(Currency currency) {
    this.balance = 0;
    this.currency = currency;
  }

  public Currency getCurrency() {
    return this.currency;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public static void main(String[] args) {
    Account account = new Account(Currency.HKD);
    System.out.println(account.getCurrency() + " " + account.getBalance());
  }
}
