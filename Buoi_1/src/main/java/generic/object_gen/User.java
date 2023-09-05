package generic.object_gen;

import java.util.Objects;

public class User {
  private String name;

  private Integer age;

  public User(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    User user = (User) object;
    return Objects.equals(name, user.name) && Objects.equals(age, user.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }


  public Integer getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
}
