package generic.object_gen;

public class Demo<T> {
  private T obj;

  public Demo(Class<T> tClass) throws InstantiationException, IllegalAccessException {
    this.obj = tClass.newInstance();
  }

  public T getObj() {
    return obj;
  }
}
