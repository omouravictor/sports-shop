package Interfaces;

import java.util.List;

public interface IControls<T> {
    public T create();

    public void read(T objeto);

    public T update(T objeto);

    public boolean delete(T objeto);

    public void showInicialScreen();

    public void print();

    //A serem usados com integração com Grid
    public List<T> getAll();

    public boolean filter(String column, String valor);

    public T getAObject();
}
