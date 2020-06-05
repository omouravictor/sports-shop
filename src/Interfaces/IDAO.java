package Interfaces;

import java.util.List;

public interface IDAO {

    public Object create(Object novo);

    public Object addUpdate(Object editado);

    public boolean delete(Object aRemover);

    public Object findById(int id);

    public Object findById(long id);

    public List<Object> find(List<Object> t);

    public List<Object> findAll();
}
