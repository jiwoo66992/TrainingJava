package ex_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.*;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(Path.of("demo1.txt"));

    // Kiem tra file con dong du lieu khong

    List<User> users = new ArrayList<>();

    while (scanner.hasNext()) {
      String[] str = scanner.nextLine().split("\\|");

      users.add(new User(Long.parseLong(str[0]), str[1], str[2], str[3], str[4], str[5]));
    }

    System.out.println(users.size());

    // Sap xep user theo id tang dan
    Collections.sort(users, new Comparator<User>() {
      @Override
      public int compare(User o1, User o2) {
        return o1.getId().compareTo(o2.getId());
      }
    });

    for (User user : users) {
      System.out.println(user.getId());
    }

    // Thu hien luu lai list user vào file cũ
    FileWriter fileWriter = new FileWriter("demo1.txt", false);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    PrintWriter printWriter = new PrintWriter(bufferedWriter);

    for (User user : users) {
      System.out.println("Ghi user id = " + user.getId() + " vao file");

      // Ghi file
      printWriter.println(
          user.getId() + "|"
          + user.getName() + "|"
          + user.getUsername() + "|"
          + user.getPassword() + "|"
          + user.getEmail() + "|"
          + user.getPhoneNumber()
      );
    }

    // commit
    printWriter.close();
    bufferedWriter.close();
    fileWriter.close();

  }
}
