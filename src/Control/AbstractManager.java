package Control;

import Model.Interfaces.IManagers;

public abstract class AbstractManager implements IManagers {

    protected DAO dao = new DAO();

}
