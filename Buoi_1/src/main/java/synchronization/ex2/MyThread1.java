package synchronization.ex2;

public class MyThread1 extends Thread {

  @Override
  public void run() {
    Table.print(5);
  }

}
