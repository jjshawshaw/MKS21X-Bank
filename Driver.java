public class Driver{
  public static void main(String[] args) {
    BankAccount a = new BankAccount(1, 1000, "123");
    System.out.println("accountID: " + a.getAccountID());
    System.out.println("balance: " + a.getBalance());
  }
}
