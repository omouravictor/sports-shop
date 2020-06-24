package Model.Interfaces;

import java.util.List;

public interface IDAO {

    public Object createInBank(Object newT);

    public Object updateInBank(Object toUpdate);

    public boolean deleteInBank(Object toRemove);

    public List<Object> getAllFromBank(Class entityClassToLookFor);
}
