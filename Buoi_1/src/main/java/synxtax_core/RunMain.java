package synxtax_core;

import java.util.*;

public class RunMain {
  // Method compareTo:
  //a > b => 1
  //a < b => -1
  //a == b => 0
  public static void main(String[] args) {
//    Double, Integer, Long, Float
//    double, int, long, float
//    Double a = 12.0;
//    Double b = 12.0;

//    System.out.println(a.compareTo(b));


    // String
    String str = "a      b c d"; //
//    String str2 = ""; //
//    System.out.println(str);
//
////    str.compareToIgnoreCase(str2) == 0
////    str.equals(str2)
//
//    System.out.println(str.substring(1, 2)); //[1, 2)
//
    System.out.println(Arrays.asList(str.split(" ")).toString());
//
//    System.out.println(str.contains("b  "));
//
//    System.out.println(str.trim());
//
//    System.out.println(str2.isEmpty());
//
//    String s = str + "1"; // 2

//    StringBuilder stringBuilder = new StringBuilder("1234");
//    stringBuilder.reverse(); //3
//
//    System.out.println(stringBuilder);




//    int[] arr = new int[10];
//    char[] s = new char[255];
//    s[0] = 'c';
//    s[1] = 'b';
//    s[2] = 'd';
//    s[3] = 'a';
//
//    for (int i=0; i<s.length; i++) {
//      System.out.println(s[i]);
//
//    }

    // Collection //4
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 13, 4));

    System.out.println(list.containsAll(Arrays.asList(4, 3, 2, 1)));
    System.out.println(list.indexOf(8));

//    System.out.println(list.equals(Arrays.asList(1, 2, 13, 4)));

//    System.out.println(list.remove(2));
//    list.set(0, 10);
    //[1, 2)
    list = list.subList(1, 3);
    System.out.println(list);

    // 5
//    LinkedList: delete, insert
//    ArrayList: Lưu, duyệt

    // size = ?
    list.add(null);
    list.add(null);
    list.add(null);
    list.add(null);

    list.clear();

    // size = ?
    Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4));
    set.add(null);
    set.add(null);
    set.add(null);
    set.add(null);
    System.out.println(set);

    set.clear();

    // Collection: //
    List<Integer> arr = List.of(1, 2, 3, 2, 3, 4, 5, 6, 6, 7);
    System.out.println(new HashSet<>(arr));

    Map<Integer, String> map = new HashMap<>();
    map.put(null, "123");
    map.put(null, "1233455");
    map.clear();
    System.out.println(map.size());

  }

  public static String changeValue(String a) { //1
    a = "123456";
    return a;
  }

}
