package thread;

public class MethodThreadRunMain {

  public static void main(String[] args) throws InterruptedException {
    ThreadSimple threadSimple = new ThreadSimple();
    System.out.println("Main start....");

    // Xử lý tính toán
    threadSimple.setDaemon(true);
    threadSimple.start(); //-> tạo luồng khác để chạy
//    threadSimple.join(); // Phụ thuộc vào nhau - threadSimple chạy xong thì main mới chạy
    System.out.println(threadSimple.isDaemon());

    threadSimple.join(2500); // Phụ thuộc vào nhau - threadSimple chạy xong thì main mới chạy

    System.out.println("Main end");
  }

}
