package Model.Tables;

import Interfaces.ITables;
import Model.Classes.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class SaleClientSearchTableModel extends AbstractTableModel implements ITables<Client> {

    private List<Client> clientList = new ArrayList<>();
    private final String[] columns = {"Id", "Name", "CPF", "Phone",
        "Email", "ZipCode", "Street", "Number", "Neyghborhood", "City", "State"};

    public SaleClientSearchTableModel() {
    }

    public SaleClientSearchTableModel(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public int getRowCount() {
        return clientList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return clientList.get(rowIndex).getId();
            case 1:
                return clientList.get(rowIndex).getName();
            case 2:
                return clientList.get(rowIndex).getCpf();
            case 3:
                return clientList.get(rowIndex).getCellPhone();
            case 4:
                return clientList.get(rowIndex).getEmail();
            case 5:
                return clientList.get(rowIndex).getZipCodeAddress();
            case 6:
                return clientList.get(rowIndex).getStreetAddress();
            case 7:
                return clientList.get(rowIndex).getNumberAddress();
            case 8:
                return clientList.get(rowIndex).getNeighborhoodAddress();
            case 9:
                return clientList.get(rowIndex).getCityAddress();
            case 10:
                return clientList.get(rowIndex).getStateAddress();
        }
        return null;
    }

    @Override
    public void addObjectRow(Client client) {
        if (client != null) {
            clientList.add(client);
            this.fireTableDataChanged(); // Finishes the add
        }
    }

    public void addObjectRowS(List<Client> clientList) {
        if (clientList != null) {
            this.clientList.addAll(clientList);
            this.fireTableDataChanged(); // Finishes the add
        }
    }

    @Override
    public void removeObjectRow(int rowIndex) {
        // The rowIndex starts with 0 and goes up until the clientList size -1
        if (rowIndex > -1 && rowIndex < clientList.size()) {
            clientList.remove(rowIndex);
            this.fireTableRowsDeleted(rowIndex, rowIndex); // Finishes the remove
        }
    }

    @Override
    public Client getObjectByRow(int rowIndex) {
        // The rowIndex starts with 0 and goes up until the clientList size -1
        if (rowIndex > -1 && rowIndex < clientList.size()) {
            return clientList.get(rowIndex);
        }
        return null;
    }

    @Override
    public void filter(JTable filterJtable, String[] viewfilters) {
        TableRowSorter tableRowSorter = new TableRowSorter(this);
        tableRowSorter.setStringConverter(new TableStringConverter() {
            @Override
            public String toString(TableModel model, int rowIndex, int columnIndex) {
                /* This function make all elements of the productList starts to lower case,
                doing so is possible filter the rows ignoring cases. */
                try {
                    return model.getValueAt(rowIndex, columnIndex).toString().toLowerCase();
                } catch (NullPointerException e) {
                    return null;
                }
            }
        });
        List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
        filterTypes.add(RowFilter.regexFilter(viewfilters[0].toLowerCase(), 1)); // filter name column
        filterTypes.add(RowFilter.regexFilter(viewfilters[1].toLowerCase(), 2)); // filter CPF column
        RowFilter<Object, Object> columnFilters = RowFilter.andFilter(filterTypes);
        tableRowSorter.setRowFilter(columnFilters);
        filterJtable.setRowSorter(tableRowSorter);
    }

    @Override
    public void updateObjectRow(Client oldT, Client newT) {
        // This function it's not necessary here.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRowByObject(Client t) {
        // This function it's not necessary here.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public String[] getColumns() {
        return columns;
    }
}
