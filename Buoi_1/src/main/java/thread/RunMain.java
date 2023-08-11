package thread;

public class RunMain {

  public static void main2(String[] args) throws InterruptedException {
    // Thread: Lồng thực hiện 1 tiến trình nào đó
    System.out.println(Thread.currentThread().getName());

//    HHD, -> 10/s
//    SSD, -> 100/s
//    Lượng tử -> 1000/s

    // Multi-thread là 1 tiến trình thực hiện nhiều luồng

//    App nghe nhạc
//    1 luồng -> phát nhạc
//    1 luồng hiển thị UI / Search bài hát

    // Không block luồng khi thực hiện 1 tác vụ khác
    // Chia sẻ tài nguyên với nhau khi chạy

//    A -> tìm số lẻ
//    B -> tìm số chẵn
//    C -> tìm số lẻ, tìm số chẵn

    // Thực hiện nhiều tác vụ

//    for (int i=0; i<1000000; i++) {
//      System.out.println("ABC");
//      Thread.sleep(100);
//    }


  }


  public static void main(String[] args) {
    ThreadSimple threadSimple1 = new ThreadSimple();
    ThreadSimple threadSimple2 = new ThreadSimple();
    ThreadSimple threadSimple3 = new ThreadSimple();

    //  public static final int MIN_PRIORITY = 1;
    //  public static final int NORM_PRIORITY = 5;
    //  public static final int MAX_PRIORITY = 10;

    threadSimple1.setName("--- Thread 1 ---");
    threadSimple1.setPriority(5);
    threadSimple2.setName("--- Thread 2 ---");
    threadSimple2.setPriority(10);
    threadSimple3.setName("--- Thread 3 ---");
    threadSimple3.setPriority(1);

    // 1 - Read database
    // 2 - Process data
    // 3 - Update

    System.out.println("Thread = " + Thread.currentThread().getName());
    threadSimple1.start();
    threadSimple2.start();
    threadSimple3.start();



    // Nếu không gọi qua start thì run được gọi như 1 method bình thường chạy dưới thread main
  }


}
