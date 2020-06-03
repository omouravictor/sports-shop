package Model.Tables;

import Model.Classes.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class SaleClientSearchTableM extends AbstractModel<Client> {

    public SaleClientSearchTableM() {
        this.columnNames = new String[]{"Id", "Name", "CPF", "Phone", "Email",
            "ZipCode", "Street", "Number", "Neyghborhood", "City", "State"};
    }

    public SaleClientSearchTableM(List<Client> clientList, String[] columnNames) {
        this.list = clientList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getCpf();
            case 3:
                return list.get(rowIndex).getCellPhone();
            case 4:
                return list.get(rowIndex).getEmail();
            case 5:
                return list.get(rowIndex).getZipCodeAddress();
            case 6:
                return list.get(rowIndex).getStreetAddress();
            case 7:
                return list.get(rowIndex).getNumberAddress();
            case 8:
                return list.get(rowIndex).getNeighborhoodAddress();
            case 9:
                return list.get(rowIndex).getCityAddress();
            case 10:
                return list.get(rowIndex).getStateAddress();
        }
        return null;
    }

    @Override
    public void filter(JTable filterJtable, String[] viewfilters) {
        TableRowSorter tableRowSorter = new TableRowSorter(this);
        tableRowSorter.setStringConverter(new TableStringConverter() {
            @Override
            public String toString(TableModel model, int rowIndex, int columnIndex) {
                /* This function make all elements of the productList starts to
                lower case, doing so is possible filter the rows ignoring cases.*/
                try {
                    return model.getValueAt(rowIndex, columnIndex).toString().toLowerCase();
                } catch (NullPointerException e) {
                    return null;
                }
            }
        });
        List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
        filterTypes.add(RowFilter.regexFilter(viewfilters[0].toLowerCase(), 1));
        // viewfilters[0] filter of name column
        filterTypes.add(RowFilter.regexFilter(viewfilters[1].toLowerCase(), 2));
        // viewfilters[1] filter of CPF column
        RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
        tableRowSorter.setRowFilter(rowFilters);
        filterJtable.setRowSorter(tableRowSorter);
    }
}
