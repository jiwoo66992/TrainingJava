package generic.interface_gen;

public class GenericServiceImp<T> implements GenericService<T>{
  @Override
  public void insert(T obj) {
    System.out.println("Insert = " + obj.getClass());
  }

  @Override
  public void update(T obj) {
    System.out.println("Update = " + obj.getClass());
  }
}
