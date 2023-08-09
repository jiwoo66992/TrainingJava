package oop;

public class RunMain {
  public static void main(String[] args) {
    HocSinh hocSinh = new HocSinh();
    System.out.println(hocSinh);

    HocSinh hocSinh2 = hocSinh.clone();

    hocSinh2.name = "1231231231";

    System.out.println(hocSinh2);
    System.out.println(hocSinh);

    //Thuoc tinh           phuong thuoc

//    hocSinh.sleep();
//    hocSinh.eat();
//    System.out.println(hocSinh.name);
//
//    showName("123");
//    showName(1);

    VatThe vatThe = (String s, Integer a) -> {
      System.out.println(s);
      System.out.println(s);
      System.out.println(s);
    };

    vatThe.showName("123", 12);


  }

  private static void showName(String a) {
    System.out.println(a);
  }
  private static int showName(Integer a) {
    System.out.println(a);
    return a;
  }
  private static void showName(String s, Integer a) {
    System.out.println(a);
  }

}
