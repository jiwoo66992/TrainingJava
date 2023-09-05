package synchronization.ex1;

public class RunMain {
  public static void main(String[] args) {

    Table obj = new Table();

    MyThread1 myThread1 = new MyThread1(obj);

    MyThread2 myThread2 = new MyThread2(obj);

    myThread1.start();
    myThread2.start();

  }
}
