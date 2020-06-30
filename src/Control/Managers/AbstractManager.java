package Control.Managers;

import Control.DAO.DAO;
import Model.Interfaces.IManagers;
import java.util.List;

public abstract class AbstractManager<T> implements IManagers<T> {

    protected DAO<T> dao;

    public AbstractManager() {
        dao = new DAO() {
        };
    }

    @Override
    public void delete(T t) throws Exception {
        // Sends the Exception to the view
        dao.deleteInBank(t);
    }
    
    @Override
    public List<T> getAll(Class classToGetAll) {
        return dao.getAllFromBank(classToGetAll);
    }
}
