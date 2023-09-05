package reflection_java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class RunMain {

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    User u = new User(10L);
    User u2 = new User(99L);
    // Generic trong java
    Class<?> user = User.class;

    System.out.println(user.getName()); // Lấy ra tên của class

    System.out.println(List.of(user.getConstructors())); // Lấy ra các constructor

    // Get constructor không đối
    Constructor<?> singleConstructor = user.getConstructor();
    // Tạo object bằng constructor không đối = newInstance
    User instance = (User) singleConstructor.newInstance();

//    System.out.println(instance);

//    Constructor<?> [] constructors = user.getConstructors();
//    System.out.println("Constructor: ");
//    for (Constructor<?> constructor : constructors) {
//      System.out.println(" - " + constructor.toString());
//    }
//
    System.out.println(List.of(user.getMethods())); // Lấy ra các method
//    Method[] listMethod = user.getDeclaredMethods();
//    System.out.println("Method: ");
//    for (Method method : listMethod) {
//      if (method.getName().equals("print3")) {
//        method.invoke(u2, 80, "ABC");
//      }
//      System.out.println("   Name = " + method.getName());
//      System.out.println("      Return type = " + method.getReturnType());
//      System.out.println("      Modifier = " + method.getModifiers());
//      System.out.println("      Number param = " + method.getParameterCount());
//      System.out.println("      List param type = " + List.of(method.getParameterTypes()));
//    }


    System.out.println(List.of(user.getDeclaredFields())); // Lấy ra các fields

    Field[] listFields = user.getDeclaredFields();
    System.out.println("Fields: ");
    for (Field field : listFields) {
      System.out.println("   -  Name = " + field.getName());
      System.out.println("      Type = " + field.getType());
      System.out.println("      Modifier = " + field.getModifiers());
    }

    // Gọi field của object
    Field fieldAge = user.getDeclaredField("name");
    fieldAge.setAccessible(true);
    fieldAge.set(u, "12312312312");

    Method privateMethod = user.getDeclaredMethod("print3", java.lang.Integer.class, java.lang.String.class);
    privateMethod.setAccessible(true);
    privateMethod.invoke(u2, 150, "Hello, invoke function");

  }

}
