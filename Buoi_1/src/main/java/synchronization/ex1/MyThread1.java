package synchronization.ex1;

public class MyThread1 extends Thread {
  private Table table;

  // MyThread(Table table)
  public MyThread1(Table table) {
    this.table = table;
  }

  @Override
  public void run() {
    table.print(5);
  }

}
