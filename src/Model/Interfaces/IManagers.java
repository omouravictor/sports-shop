package Model.Interfaces;

import java.util.List;

public interface IManagers<T> {

    public T create() throws Exception; // Sends the Exception to the view

    public void read(T t) throws Exception; // Sends the Exception to the view

    public T update(T t) throws Exception; // Sends the Exception to the view

    public void delete(T toRemove) throws Exception; // Sends the Exception to the view

    public List<T> getAll();

    public void showCRUDscreen();
}
