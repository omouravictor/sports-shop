package Model.Interfaces;

public interface ICRUD<T> {

    public T create();

    public void read();

    public T update();

    public T delete();
}
