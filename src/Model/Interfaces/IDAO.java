package Model.Interfaces;

import java.util.List;

public interface IDAO {

    public boolean createInBank(Object newT);

    public boolean updateInBank(Object toUpdate);

    public boolean deleteInBank(Object toRemove);

    public Object getFromBankById(Class classToLookFor, long id);

    public List<Object> getAllFromBank(Class classToLookFor);
}
