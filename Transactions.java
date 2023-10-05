public class Transactions {

  public static void transactions() {
    Singleton singleton = Singleton.getInstance();

    singleton.withdraw(300);
    singleton.deposit(12);
    singleton.deposit(54);
    singleton.withdraw(47);
  }

  public static void balance() {
    // OK : call singleton and get total
    Singleton singleton = Singleton.getInstance();
    int total = singleton.getBank().getTotal();

    System.out.printf("Your balance is:%d%n", total);
  }
}
