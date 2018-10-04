public class Driver{
  public static void main(String[] args) {
    BankAccount a = new BankAccount(1, 1000, "123");
    System.out.println(a);

    a.deposit(2000);
    System.out.println(a);

    if (a.withdraw(1000)) System.out.println("Withdrawl success!");
    else System.out.println("Withdrawl failure");
    System.out.println(a);

    if (a.withdraw(5000)) System.out.println("Withdrawl success!");
    else System.out.println("Withdrawl failure");
    System.out.println(a);
  }
}
