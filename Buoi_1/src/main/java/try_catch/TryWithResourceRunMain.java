package try_catch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceRunMain {

  public static void main(String[] args) {


    try (FileReader fileReader = new FileReader("ABC")) {
      fileReader.read();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    // Custom exception

  }
}
