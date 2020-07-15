package Model.Tables;

import Model.EntitiesClasses.Sale;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbSaleModel extends AbstractTbModel<Sale> {

    public TbSaleModel(List<Sale> saleList) {
        super(saleList);
        this.columnNames = new String[]{"Id", "Date", "Client Name", "Client CPF",
            "Cost"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getSaleDate();
            case 2:
                return list.get(rowIndex).getClient().getName();
            case 3:
                return list.get(rowIndex).getClient().getCpf();
            case 4:
                return costFormatter.formatCost(list.get(rowIndex).getSaleCost());
        }
        return null;
    }

    public TableRowSorter getRowSorter(String[] filters) {
        if (filters.length != 0) {
            TableRowSorter tableRowSorter = new TableRowSorter(this);
            tableRowSorter.setStringConverter(new TableStringConverter() {
                @Override
                /* This function change all elements of the list to lower case,
                doing so is possible filter the rows ignoring cases.*/
                public String toString(TableModel model, int row, int column) {
                    try {
                        return model.getValueAt(row, column).toString().toLowerCase();
                    } catch (NullPointerException e) {
                        return "ERRO";
                    }
                }
            });
            //viewFilters must to be on the same sequence of this model columns
            int column = 0;
            List<RowFilter<Object, Object>> filterTypes = new ArrayList<>();
            for (String filter : filters) {
                if (!filter.isEmpty()) {
                    filterTypes.add(RowFilter.regexFilter(filter.toLowerCase(), column));
                }
                column++;
            }
            RowFilter<Object, Object> rowFilters = RowFilter.andFilter(filterTypes);
            tableRowSorter.setRowFilter(rowFilters);
            return tableRowSorter;
        }
        return null;
    }
}
