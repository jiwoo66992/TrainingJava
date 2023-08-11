package thread;

public class ThreadSimple2 implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is running......");
  }

}
