public class BankAccount{
  // fields
  private double balance;
  private int accountID;
  private String password;

  // constructor
  public BankAccount(int accountID, double balance, String password){
    this.balance = balance;
    this.accountID = accountID;
    this.password = password;
  }

  // methods
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }


}
