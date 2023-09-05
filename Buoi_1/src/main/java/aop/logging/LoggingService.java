package aop.logging;

import java.lang.reflect.Method;

public class LoggingService {

  public void beforeMethodExecute(Method method) {
    System.out.println("Logging data before calling method: " + method.getName());
  }

  public void afterMethodExecute(Method method) {
    System.out.println("Logging data after calling method: " + method.getName());
  }

}

