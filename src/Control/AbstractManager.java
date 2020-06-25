package Control;

import Model.Interfaces.IManagers;

public abstract class AbstractManager<T> implements IManagers<T> {

    protected DAO<T> dao = new DAO() {};

}
