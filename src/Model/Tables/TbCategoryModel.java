package Model.Tables;

import Model.EntitiesClasses.Category;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class TbCategoryModel extends AbstractTbModel<Category> {

    public TbCategoryModel() {
        this.columnNames = new String[]{"Id", "Name"};
    }

    public TbCategoryModel(List<Category> categoryList) {
        super(categoryList);
        this.columnNames = new String[]{"Id", "Name"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getName();
        }
        return null;
    }

    public void filter(JTable filterJtable, String viewFilter) {
        TableRowSorter tableRowSorter = new TableRowSorter(this);
        if (!viewFilter.isEmpty()) {
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
            RowFilter filter = RowFilter.regexFilter(viewFilter.toLowerCase(), 1);
            tableRowSorter.setRowFilter(filter);
            filterJtable.setRowSorter(tableRowSorter);
        }
    }
}
