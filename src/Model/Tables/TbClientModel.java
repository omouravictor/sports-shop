package Model.Tables;

import Model.EntitiesClasses.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbClientModel extends AbstractTbModel<Client> {

    public TbClientModel() {
        this.columnNames = new String[]{"Id", "Name", "CPF", "Phone", "Email",
            "ZipCode", "Street", "Number", "Neyghborhood", "City", "State"};
    }
    
    public TbClientModel(List<Client> clientList) {
        super(clientList);
        this.columnNames = new String[]{"Id", "Name", "CPF", "Phone", "Email",
            "ZipCode", "Street", "Number", "Neyghborhood", "City", "State"};
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

    public void filter(JTable filterJtable, String[] viewFilters) {
        TableRowSorter tableRowSorter = new TableRowSorter(this);
        if (viewFilters.length != 0) {
            tableRowSorter.setStringConverter(new TableStringConverter() {
                @Override
                /* This function change all elements of the list to lower case,
                doing so is possible filter the rows ignoring cases.*/
                public String toString(TableModel model, int row, int column) {
                    try {
                        return model.getValueAt(row, column).toString().toLowerCase();
                    } catch (NullPointerException e) {
                        return null;
                    }
                }
            });
            //viewFilters must to be on the same sequence of this model columns
            int column = 1;
            List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
            for (String viewFilter : viewFilters) {
                if (!viewFilter.isEmpty()) {
                    filterTypes.add(RowFilter.regexFilter(viewFilter.toLowerCase(), column));
                }
                column++;
            }
            RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
            tableRowSorter.setRowFilter(rowFilters);
            filterJtable.setRowSorter(tableRowSorter);
        }
    }
}
