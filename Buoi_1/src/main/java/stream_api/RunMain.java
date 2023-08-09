package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunMain {
  public static void main(String[] args) {

//    List<Integer> list = List.of(1, 2,2,2,3, 3, 4, 5, 6, 7, 10);

//    List<Integer> res = list.stream().filter(item -> item % 2 == 0)
//        .collect(Collectors.toList());
//
//    res = list.stream().map(item -> {
//      if (item % 2 != 0) {
//        return item;
//      }
//      return item*2;
//    }).collect(Collectors.toList());
//
//    System.out.println(list.stream().allMatch(item -> item == 10));

    //noneMatch: Không tồn tại giá trị nào hợp lệ
    //anyMatch: Chỉ cần toonf tại 1 giá trị hợp lệ
    //allMatch: Cần tất cả các giá trị hợp lệ
//        hinhVuong -> Map -> HinhTron

//    res = list.parallelStream().distinct().collect(Collectors.toList());
//
//    System.out.println(list.stream().distinct().findFirst().get());

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i < 6; i++) {
      list.add(i);
    }


//
//    long start = System.currentTimeMillis();

//    list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
//    list.parallelStream().filter(item -> item % 2 == 0).collect(Collectors.toList());
//
//    long end = System.currentTimeMillis();
//
//    System.out.println("Tổng thời gian: " + (end - start));

    String str = "item1 10 item2 25";

    int sum = Arrays.stream(str.split(""))
        .filter(item -> item.matches("\\d+"))
        .mapToInt(Integer::valueOf)
        .sum();

    System.out.println(sum);


  }
}
//1476
