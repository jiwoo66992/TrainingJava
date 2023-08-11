package try_catch;

public class DemoExRunMain {

  public static void main(String[] args) {
    // NullPointerException
    String obj = null;

//    System.out.println(obj.length());

    //NumberFormatException
    String str = "abc";
//    System.out.println(Integer.parseInt(str));

    //ArrayIndexOutOfBoundsException
    int[] arr = new int[5];

//    arr[10] = 100;

    try {
      System.out.println(obj.length());
    } catch (Exception ex) {
      System.out.println(ex.getClass());
      if (ex.getClass().getName().toString().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        System.out.println("Ghi log lỗi ArrayIndexOutOfBoundsException vào database");
      } else if (ex.getClass().getName().toString().equals("java.lang.NullPointerException")) {
        System.out.println("Ghi log lỗi NullPointerException vào database");
      } else {
        System.out.println("Ghi log lỗi chung");
      }
    }
  }

}
