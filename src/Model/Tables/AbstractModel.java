package Model.Tables;

import Interfaces.ITables;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public abstract class AbstractModel<T> extends AbstractTableModel implements ITables<T> {

    protected List<T> list = new ArrayList<>();
    protected String[] columnNames = new String[]{};

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
    public void addObjectRow(T product) {
        if (product != null) {
            list.add(product);
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
    public void updateObjectRow(T oldT, T newT) {
        if (oldT != null && newT != null) {
            int rowToUpdate = list.indexOf(oldT);
            if (rowToUpdate != -1) {
                list.set(rowToUpdate, newT);
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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
}
