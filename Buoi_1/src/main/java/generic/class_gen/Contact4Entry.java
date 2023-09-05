package generic.class_gen;

public class Contact4Entry<K, V, T> extends KeyValuePair<K, V> {
  private T obj;
  public Contact4Entry(K key, V value) {
    super(key, value);
  }

  public Contact4Entry(K key, V value, T obj) {
    super(key, value);
    this.obj = obj;
  }

  public T getObj() {
    return obj;
  }

  public void setObj(T obj) {
    this.obj = obj;
  }
}
