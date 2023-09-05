package generic.method_gen;

import java.util.Collection;

public class CollectionUtils {

  public static <T> int count(Collection<T> collection, T itemCount) {
    int res = 0;
    for (T item : collection) {
      if (itemCount.equals(item)) {
        res++;
      }
    }
    return res;
  }

}
