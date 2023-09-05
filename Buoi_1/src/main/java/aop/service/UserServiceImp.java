package aop.service;

import aop.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {

  @Override
  public List<User> getListUser() {
    System.out.println("----------------Get list user from database--------------------");
    List<User> output = new ArrayList<>();

    output.add(new User(1L, "User 1"));
    output.add(new User(2L, "User 2"));
    output.add(new User(3L, "User 3"));
    output.add(new User(4L, "User 4"));

    return output;
  }

}
