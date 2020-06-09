package Model.Interfaces;

import javax.swing.JTable;

public interface ITables<T> {

    public void addObjectRow(T t);

    public void removeObjectRow(int rowIndex);
    
    public void removeObjectRow(T t);

    public void updateObjectRow(T oldT, T newT);

    public T getObjectByRow(int rowIndex);

    public void filter(JTable filterJtable, String[] viewfilters);
}
