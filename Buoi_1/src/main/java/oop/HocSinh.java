package oop;

public class HocSinh implements Cloneable{

  public String name;

  private Integer age;

  public void sleep() {
    System.out.println("Hoc sinh Sleeping....");
  }

  public void setAge(Integer age) {
    if(age >= 18) {
      this.age = age;
    }
  }

  public Integer getAge() {
    if(age == null) {
      return 18;
    }
    return age;
  }

  @Override
  public String toString() {
    return "HocSinh{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public HocSinh clone() {
    try {
      return (HocSinh) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
