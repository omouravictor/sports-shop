package Model.Interfaces;

import java.util.List;

public interface IManagers<T> {

    public T create();

    public void read(T t);

    public T update(T t);

    public boolean delete(T toRemove);
    
    public List<T> getAllFromBank();
}
