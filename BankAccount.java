public class BankAccount{
  // fields
  private double balance;
  private int accountID;
  private String password;

  // constructor
  public BankAccount(double balance, int accountID, String password){
    this.balance = balance;
    this.accountID = accountID;
    this.password = password;
  }

  // methods
  public String toString() {
    return accountID + "\t" + balance;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public boolean deposit(double input) {
    if (input < 0) return false;
    else {
      balance += input;
      return true;
    }
  }
  public boolean withdraw(double input) {
    if ((input > balance) || (input < 0)) return false;
    else {
      balance -= input;
      return true;
    }
  }
  private boolean authenticate(String password) {
    return (password == this.password);
  }
  public boolean transferTo(BankAccount other, double amount, String password) {
    if other.authenticate(password) {
      return (this.withdraw(amount) && other.deposit(amount));
    }
    else return false;
  }

}
