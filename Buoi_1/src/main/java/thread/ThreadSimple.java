package thread;

public class ThreadSimple extends Thread {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is running......");

    for (int i=0; i<10; i++) {
      System.out.println("i = " + i);
      try {
        sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

  }

}
