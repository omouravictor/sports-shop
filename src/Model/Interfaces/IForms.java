package Model.Interfaces;

public interface IForms<T> {
    
    public void initSetup();

    public void prepareCreate();

    public T getObjectCreated();

    public T create();

    public void prepareRead();
    
    public void read(T t);
    
    public void prepareUpdate(T t);

    public T update(T t);

    public void setTxtModels();

    public void setVisibleAll();

    public void setEnabledAll();

    public void setNoEnabledAll();

    public void setEditableAll();

    public void setNoEditableAll();

    public void setEmptyAll();

    public boolean fieldsAreEmpty();

    public boolean checkAll();

    public void showForm();

    public T getObjectUpdated(T oldT);
}
