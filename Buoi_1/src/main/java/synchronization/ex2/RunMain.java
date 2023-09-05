package synchronization.ex2;

public class RunMain {
  public static void main(String[] args) {

    MyThread1 myThread1 = new MyThread1();

    MyThread2 myThread2 = new MyThread2();

    // Luồng 1 => Syncronized GetData1() Get hết data từ data lên đã | Get data mà không cần chờ luồng 2 xử GetData2()
    // Luồng 2 => Get xong data process ProcessData1()

    myThread1.start();
    myThread2.start();

  }
}
