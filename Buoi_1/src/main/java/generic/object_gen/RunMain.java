package generic.object_gen;

import java.util.Optional;

public class RunMain {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    Demo<Long> generic = new Demo<>(Long.class);
  }
}
