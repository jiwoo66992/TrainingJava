package ex_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

  public static void main2(String[] args) throws IOException {

    OutputStream outputStream = new FileOutputStream("demoZipFile.zip");
    ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
    // Thao tac voi file demo1 trong zip
    ZipEntry zipEntry = new ZipEntry("demo1.txt");

    zipOutputStream.putNextEntry(zipEntry);

    // Khoi 1 file de lay data
    FileInputStream fileInputStream = new FileInputStream("data_demo.txt");
    byte[] buffer = new byte[1024];
    int length;

    while((length = fileInputStream.read(buffer)) > 0) {
      zipOutputStream.write(buffer, 0, length);
    }

    fileInputStream.close();
    zipOutputStream.closeEntry();
    zipOutputStream.close();

  }

  public static void main(String[] args) throws IOException {
    File outputZipFile = new File("D:\\Training\\Training Java - BuiVan\\Buoi_1\\demoZipAllFile.zip");

    File inputDir = new File("D:\\VTI\\bitly");

    zipDirectory(inputDir, outputZipFile);

  }

  public static void zipDirectory(File inputDir, File outputZipFile) throws IOException {
    // Tạo thu mục cha cho file đầu ra (output)
    outputZipFile.getParentFile().mkdirs();

    String inputDirPath = inputDir.getAbsolutePath();

    // Khởi tạo output stream
    FileOutputStream fos = null;
    ZipOutputStream zipOs = null;

    // Lấy tất cả các file
    List<File> fileList = listChildFile(inputDir);

    // Tạo 1 đối tượng ZipOutputStream để ghi file zip.
    fos = new FileOutputStream(outputZipFile);
    zipOs = new ZipOutputStream(fos);

    for (File file : fileList) {
      String filePath = file.getAbsolutePath();

      System.out.println(file.getAbsolutePath());

      System.out.println("Zipping file name = " + file.getName());
      String entryName = filePath.substring(inputDirPath.length() + 1);

      System.out.println("EntryName = " + entryName);

      ZipEntry zipEntry = new ZipEntry(entryName);
      // Thêm entry vào file zip
      zipOs.putNextEntry(zipEntry);

      // Doc dữ liệu của file cần  nén vào trong file zip (zipEntry)
      FileInputStream fileInputStream = new FileInputStream(filePath);

      byte[] buffer = new byte[1024];
      int length;

      while((length = fileInputStream.read(buffer)) > 0) {
        zipOs.write(buffer, 0, length);
      }

      fileInputStream.close();
    }
    zipOs.close();
    fos.close();
  }


  // Lấy tất cả các file con cháu bên trong 1 folder to
  private static List<File> listChildFile(File dir) {
    List<File> allFile = new ArrayList<>();

    // Lay tất cả các file trong folder
    File[] childFiles = dir.listFiles();
    for (File file : childFiles) {
      if (file.isFile()) {
        allFile.add(file);
      } else {
        List<File> files = listChildFile(file);
        allFile.addAll(files);
      }
    }

    return allFile;
  }

}


// Try catch
// Try with resource
// Đa luồng