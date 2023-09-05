package synchronization.ex1;

public class MyThread2 extends Thread {
  Table table;

  // MyThread(Table table)
  public MyThread2(Table table) {
    this.table = table;
  }

  @Override
  public void run() {
    table.print(100);
  }

}
