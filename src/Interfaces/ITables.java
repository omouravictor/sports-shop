package Interfaces;

import javax.swing.JTable;

public interface ITables<T> {

    public void addObjectRow(T t);

    public void removeObjectRow(int rowIndex);

    public void updateObjectRow(T oldT, T newT);

    public void filter(JTable filterJtable, String[] filters);

    public T getObjectByRow(int rowIndex);

    public int getRowByObject(T t);
}
