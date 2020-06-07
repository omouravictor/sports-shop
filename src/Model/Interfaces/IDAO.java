package Model.Interfaces;

import java.util.List;

public interface IDAO {

    public boolean create(Object newT);

    public boolean update(Object toUpdate);

    public boolean delete(Object toRemove);

    public Object getObjectById(Class classToLookFor, long id);

    public List<Object> getAllObjects(Class classToLookFor);
}
