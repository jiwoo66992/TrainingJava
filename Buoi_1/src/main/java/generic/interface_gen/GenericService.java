package generic.interface_gen;

public interface GenericService<T> {
  void insert(T obj);
  void update(T obj);
}

