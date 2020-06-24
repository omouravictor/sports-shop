package Model.Interfaces;

public interface IManagers {

    public Object create();

    public void read(Object t);

    public Object update(Object t);

    public boolean delete(Object toRemove);
}
