package campare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunMain {
  public static void main(String[] args) {
    Dog dog1 = new Dog("dog1", 10);
    Dog dog2 = new Dog("dog1", 5);
    Dog dog3 = new Dog("dog10", 10);

    List<Dog> list = new ArrayList<>();
    list.add(dog1);
    list.add(dog2);
    list.add(dog3);

    Collections.sort(list, new Comparator<Dog>() {
      @Override
      public int compare(Dog o1, Dog o2) {
        if (o1.getAge() - o2.getAge() == 0) {
          return o1.getName().compareTo(o2.getName());
        }
        return o1.getAge() - o2.getAge();
      }
    });


//    System.out.println(list);

//    System.out.println(dog1.compareTo(dog2));

    Dog dog4 = new Dog("dog4", 10);
    Dog dog5 = new Dog("dog4", 10);
    System.out.println(dog4.equals(dog5));


    Integer a = 1;
    Integer b = new Integer(1);

    System.out.println(a == b);
    System.out.println(a.equals(b));

    //0. ++ hoặc -- đứng trước
    //1. Ngoặc
    //2. Nhân hoặc chia (từ trái qua phải)
    //3. Cộng hoặc trừ (từ trái qua phải)
    //4. ++ hoặc -- đứng sau

    System.out.println((5+3) / 2 * (5 - 2));

    int aa = 1;

    System.out.println(++aa * 2 + aa++);
  }
}
