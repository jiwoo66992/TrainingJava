package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RunMain {

  public static void main(String[] args) {
    String regNumber = "^[\\d]+$";
    String regPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";

    String number1 = "12345345123";
    String number2 = "12345345123a";

//    System.out.println(Pattern.matches(regNumber, number1));
//    System.out.println(Pattern.matches(regNumber, number2));

    System.out.println(number1.matches(regNumber));
    System.out.println(number2.matches(regNumber));

    Scanner sc = new Scanner(System.in);
    String pass;
    do {
      System.out.print("Nhap pass = ");
      pass = sc.nextLine();
      if (!pass.matches(regPass)) {
        System.out.println("Password yếu");
      }
    } while (!pass.matches(regPass));
  }

}
