package generic.class_gen;

// Cách 1: Khai bao kiểu dữ liệu cố định
public class ContactEntry extends KeyValuePair<String, Integer> {
  public ContactEntry(String key, Integer value) {
    super(key, value);
  }
}
