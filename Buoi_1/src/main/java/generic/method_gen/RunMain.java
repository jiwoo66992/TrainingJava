package generic.method_gen;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
  public static void main(String[] args) {

    List<String> stringList = List.of("A", "B", "C", "A", "A", "C");
    List<Integer> integerList = List.of(1, 2, 3, 1, 1, 3);
    List<User> userList = List.of(new User("A", 1), new User("B", 2), new User("A", 1), new User("C", 1));

    System.out.println("List string có " + CollectionUtils.count(stringList, "A") + " phần tử A");
    System.out.println("List integer có " + CollectionUtils.count(integerList, 3));
    System.out.println("List user có " + CollectionUtils.count(userList, new User("A", 1)));

  }
}
