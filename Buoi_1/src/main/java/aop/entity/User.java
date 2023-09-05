package aop.entity;

import java.util.Objects;

public class User {

  private Long id;

  private String name;

  public User(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

}
