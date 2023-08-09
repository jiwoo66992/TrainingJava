package oop;

public class ConNguoi implements IConNguoi {

  public String name = "Name cuar class con nguoi";


  @Override
  public void sleep() {

  }

  @Override
  public void eat() {
    System.out.println("Con nguoi dang ăn....");
  }

  @Override
  public void learn() {

  }

  @Override
  public String toString() {
    return "ConNguoi{" +
        "name='" + name + '\'' +
        '}';
  }
}
