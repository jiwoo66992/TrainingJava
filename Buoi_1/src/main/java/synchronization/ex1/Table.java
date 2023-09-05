package synchronization.ex1;

public class Table {

  synchronized void print(int n) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(n * i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  void print2(int n) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(n * i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
