package Model.Interfaces;

public interface IForms<T> {

    public T create();

    public void read(T t);

    public T update(T t);
    
    public void setTxtModels();

    public boolean fieldsAreEmpty();

    public boolean checkAll();
    
    public T getObjectCreated();
    
    public T getObjectUpdated(T oldT);
}
