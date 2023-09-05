package synchronization.ex2;

public class MyThread2 extends Thread {
  @Override
  public void run() {
    Table.print(100);
  }

}
