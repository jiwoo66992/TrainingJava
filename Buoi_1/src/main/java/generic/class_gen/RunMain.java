package generic.class_gen;

import aop.entity.User;

public class RunMain {
  public static void main(String[] args) {

    // K - Key
    // V - Value
    // E - Element
    // T - type (String, Integer, Long...)
    // S, U, V, X, Y, Z...
    // Diamond <> - Java 7

    // Generic cho class
    KeyValuePair<Long, Integer> entry = new KeyValuePair<>(1L, 10);
    KeyValuePair<String, Long> entry2 = new KeyValuePair<>("ABC", 10L);

    System.out.println(entry.getKey());
    System.out.println(entry.getValue());

    System.out.println(entry2.getKey());
    System.out.println(entry2.getValue());


    System.out.println("=--=============================================");
    // Cách 1:
    ContactEntry contactEntry = new ContactEntry("ABC", 1);
    // Cách 2:
    Contact2Entry contact2Entry = new Contact2Entry("ABC", 1);
    // Cách 3:
    Contact3Entry contact3Entry = new Contact3Entry(10, 1);
    // Cách 4:
    Contact4Entry<String, Long, User> contact4Entry = new Contact4Entry<>("ABC", 10L, new User(1L, "Name 1"));


    // Generic cho Interface


  }
}
