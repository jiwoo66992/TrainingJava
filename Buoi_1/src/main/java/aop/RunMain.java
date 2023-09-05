package aop;

// OOP: Lập trình hướng đối tượng
// AOP: Lập trình hướng khía cạnh

// Implement java core
// AOP nhằm phân tách các chương trình thành các chức năng riêng rẽ, phân biệt, không phục thuộc nhau
// => Sửa code thì tập chung sửa 1 chỗ và giảm thời gian test chức năng
// => AOP mục đích để bổ xung cho OOP

// join point: Một điểm (nơi) để xác định chạy code trước/sau hàm chính
// pointcut: laf cách xác định join point
// Advice: Code phụ trợ cho hàm chính
//    - Before: Được thực hiện truowcscs joinpoint @Before
//    - After:  Được thực hiện sau joinpoint
//    - Around: Được thực hiện trước và sau joinpoint
//    - After returning: Được thực hiện sau joinpoint hoàn thành một cách bình thường
//    - After throwing: Được thực hiện sau joinpoint hoàn thành bằng một exception

// Aspect: Như một java class, một aspect đống gói toàn bộ joinpoint, pointcut, advice
// Target object: Là những đối tượng mà advice được áp dụng

// Logging, Error handle, Transaction management, Monitoring (gnafana, prometheus), Access control, input/output validation


// API cần lấy user từ DB, ghi log call API, và ghi log kết thúc call API


// Implement spring boot
//spring-boot-starter-aop



import aop.entity.User;
import aop.logging.AopProxyFactory;
import aop.logging.LoggingService;
import aop.service.UserService;
import aop.service.UserServiceImp;

import java.util.List;


public class RunMain {
  public static void main(String[] args) {
    LoggingService loggingService = new LoggingService();
    UserService userServiceProxy = (UserService) AopProxyFactory.createProxy(new UserServiceImp(), loggingService);

    List<User> users = userServiceProxy.getListUser();


    for (User user : users) {
      System.out.println(user);
    }

  }
}
