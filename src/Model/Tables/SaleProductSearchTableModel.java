package Model.Tables;

import Interfaces.ITables;
import Model.Classes.Product;
import Model.Classes.Shirt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

public class SaleProductSearchTableModel extends AbstractTableModel implements ITables<Product> {

    private List<Product> productList = new ArrayList<>();
    private final String[] columns = {"Stock", "Cost", "Category", "Brand", "Team",
        "Player", "ShirtName", "Sleeves", "Number", "Color", "Size", "Id"};

    public SaleProductSearchTableModel() {
    }

    public SaleProductSearchTableModel(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return productList.get(rowIndex).getNumInStock();
            case 1:
                return "R$ " + productList.get(rowIndex).getCost();
            case 2:
                return productList.get(rowIndex).getCategory().getName();
            case 3:
                return productList.get(rowIndex).getBrand().getName();
            case 4:
                return productList.get(rowIndex).getTeamName();
            case 5:
                return productList.get(rowIndex).getPlayerPresent();
            case 6:
                if (productList.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) productList.get(rowIndex);
                    return shirt.getPlayerNameOnShirt();
                }
                return "------";
            case 7:
                if (productList.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) productList.get(rowIndex);
                    return shirt.getSleeves();
                }
                return "------";
            case 8:
                return productList.get(rowIndex).getNumberPresent();
            case 9:
                return productList.get(rowIndex).getColor();
            case 10:
                return productList.get(rowIndex).getSizeProduct();
            case 11:
                return productList.get(rowIndex).getId();
        }
        return null;
    }

    @Override
    public void addObjectRow(Product product) {
        if (product != null) {
            productList.add(product);
            this.fireTableDataChanged(); // Finishes the add
        }
    }

    public void addObjectRowS(List<Product> productList) {
        if (productList != null) {
            this.productList.addAll(productList);
            this.fireTableDataChanged(); // Finishes the add
        }
    }

    @Override
    public void removeObjectRow(int rowIndex) {
        // The rowIndex starts with 0 and goes up until the productList size -1
        if (rowIndex > -1 && rowIndex < productList.size()) {
            productList.remove(rowIndex);
            this.fireTableRowsDeleted(rowIndex, rowIndex); // Finishes the remove
        }
    }

    @Override
    public void updateObjectRow(Product oldT, Product newT) {
        // This function it's not necessary here.
        throw new UnsupportedOperationException("Not supported yet.");
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
        filterTypes.add(RowFilter.regexFilter(viewfilters[0].toLowerCase(), 2)); // filter category column
        filterTypes.add(RowFilter.regexFilter(viewfilters[1].toLowerCase(), 3)); // filter brand column
        filterTypes.add(RowFilter.regexFilter(viewfilters[2].toLowerCase(), 4)); // filter team column
        filterTypes.add(RowFilter.regexFilter(viewfilters[3].toLowerCase(), 5)); // filter player column
        filterTypes.add(RowFilter.regexFilter(viewfilters[4].toLowerCase(), 8)); // filter number column
        filterTypes.add(RowFilter.regexFilter(viewfilters[5].toLowerCase(), 10)); // filter size column
        filterTypes.add(RowFilter.regexFilter(viewfilters[6].toLowerCase(), 6)); // filter shirtName column
        filterTypes.add(RowFilter.regexFilter(viewfilters[7].toLowerCase(), 7)); // filter sleeves column
        filterTypes.add(RowFilter.regexFilter(viewfilters[8].toLowerCase(), 9)); // filter color column
        filterTypes.add(RowFilter.regexFilter(viewfilters[9].toLowerCase(), 11)); // filter id column
        RowFilter<Object, Object> columnFilters = RowFilter.andFilter(filterTypes);
        tableRowSorter.setRowFilter(columnFilters);
        filterJtable.setRowSorter(tableRowSorter);
    }

    @Override
    public Product getObjectByRow(int rowIndex) {
        // The rowIndex starts with 0 and goes up until the productList size -1
        if (rowIndex > -1 && rowIndex < productList.size()) {
            return productList.get(rowIndex);
        }
        return null;
    }

    @Override
    public int getRowByObject(Product t) {
        // This function it's not necessary here.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String[] getColumns() {
        return columns;
    }
}
