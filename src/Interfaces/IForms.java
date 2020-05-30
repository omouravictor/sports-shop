package Interfaces;

public interface IForms<T> {

    public T create();

    public void read(T t);

    public T update(T t);

    public boolean checkEmptyFields();

    public boolean checkFieldsSize();

    public boolean checkAll();
}
