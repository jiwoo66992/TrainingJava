package aop.logging;

import java.lang.reflect.Proxy;

public class AopProxyFactory {

  public static Object createProxy(Object objectTarget, LoggingService aspect) {
    return Proxy.newProxyInstance(
        objectTarget.getClass().getClassLoader(),
        objectTarget.getClass().getInterfaces(),
        ((proxy, method, args) -> {
          // Trước khi gọi method chính
          aspect.beforeMethodExecute(method);

          // Gọi method chính
          Object result = method.invoke(objectTarget, args);

          // Sau khi gọi phương thức chính
          aspect.afterMethodExecute(method);

          return result;
        })
    );
  }
}
