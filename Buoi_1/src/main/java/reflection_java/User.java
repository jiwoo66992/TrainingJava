package reflection_java;

public class User implements InterfaceUser {

  public Integer age;
  protected String address;
  Long id;
  private String name;

  public User() {
    id = 0L;
    name = "Demo Reflection";
    age = 10;
    address = "Hà Nội";
  }

  public User(Long id) {
    this.id = id;
  }

  @Override
  public void print() {
    System.out.println("Id = " + id + " - name = " + name);
  }

  void print2(String name) {
    System.out.println("Id = " + id + " - name = " + name);
  }

  protected void print3(Integer age, String name) {
    System.out.println("Id = " + id + " - age = " + age + " - name = " + name);
  }

  private void print4() {
    System.out.println("Id = " + id + " - name = " + name);
  }

  @Override
  public String toString() {
    return "User{" +
        "age=" + age +
        ", address='" + address + '\'' +
        ", id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
