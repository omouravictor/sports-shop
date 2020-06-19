package Model.Tables;

import Model.Classes.CostFormatter;
import Model.Interfaces.ITables;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public abstract class AbstractTbModel<T> extends AbstractTableModel implements ITables<T> {

    protected List<T> list = new ArrayList<>();
    protected String[] columnNames = new String[]{};
    protected CostFormatter costFormatter = new CostFormatter();

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public void addObjectRow(T t) {
        if (t != null) {
            list.add(t);
            this.fireTableRowsInserted(0, list.size());
        }
    }

    @Override
    public void addObjectRowS(List<T> tList) {
        if (tList != null) {
            list.addAll(tList);
            this.fireTableRowsInserted(0, list.size());
        }
    }

    @Override
    public void removeObjectRow(int rowIndex) {
        if (rowIndex > -1 && rowIndex < list.size()) {
            list.remove(rowIndex);
            this.fireTableRowsDeleted(rowIndex, rowIndex);
        }
    }

    @Override
    public void removeObjectRow(T t) {
        if (t != null) {
            list.remove(t);
            int rowToDelete = list.indexOf(t);
            this.fireTableRowsDeleted(rowToDelete, rowToDelete);
        }
    }

    @Override
    public void updateObjectRow(T oldT, T updatedT) {
        if (oldT != null && updatedT != null) {
            int rowToUpdate = list.indexOf(oldT);
            if (rowToUpdate != -1) {
                list.set(rowToUpdate, updatedT);
                this.fireTableRowsUpdated(rowToUpdate, rowToUpdate);
            }
        }
    }

    @Override
    public T getObjectByRow(int rowIndex) {
        if (rowIndex > -1 && rowIndex < list.size()) {
            return list.get(rowIndex);
        }
        return null;
    }

    @Override
    public void clearList() {
        list.clear();
        this.fireTableRowsDeleted(0, 0);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> tlist) {
        this.list = tlist;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
}
