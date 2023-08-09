package ex_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MethodFile {

  public static void main(String[] args) throws IOException {
    File file = new File("D:\\Training\\Training Java - BuiVan\\Buoi_1\\demo1.txt");

    System.out.println("Get filename = " + file.getName());

    System.out.println("Check file có tồn tại không = " + file.exists());

    System.out.println("Lay duong dan thu muc cua file = " + file.getParent());

    System.out.println("Kiem tra co phai la folder khong = " + file.isDirectory());

    System.out.println("Kiem tra co phai la file khong = " + file.isFile());

    System.out.println("File size (byte) = " + file.length());

    // Create new file
    File file2 = new File("D:\\Training\\Training Java - BuiVan\\Buoi_1\\demo2.txt");
    if (!file2.exists()) {
      System.out.println("Create new file = " + file2.createNewFile());
    }

    System.out.println("Delete file = " + file2.delete());

    File folder1 = new File("D:\\Training\\Training Java - BuiVan\\Buoi_1\\demoCreateNewFolder2");


    System.out.println("Create folder = " + folder1.mkdir());

    File folder2 = new File("D:\\Training\\Training Java - BuiVan\\Buoi_1\\demoCreateNewFolder10");

    folder1.renameTo(folder2);

    File src = new File("D:\\Training\\Training Java - BuiVan\\Buoi_1\\src\\main\\java\\ex_file");
    System.out.println(Arrays.asList(src.list()));
  }

}
