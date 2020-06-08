package Model.Tables;

import Model.Entities.Product;
import Model.Entities.Shirt;
import java.util.List;
import javax.swing.JTable;

public class SaleFormTbAddedProductModel extends AbstractTbModel<Product> {

    public SaleFormTbAddedProductModel() {
        this.columnNames = new String[]{"QTD", "Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    public SaleFormTbAddedProductModel(List<Product> productList, String[] columnNames) {
        this.list = productList;
        this.columnNames = columnNames;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getQuantity();
            case 1:
                return list.get(rowIndex).getNumInStock();
            case 2:
                return "R$ " + list.get(rowIndex).getCost();
            case 3:
                return list.get(rowIndex).getCategory().getName();
            case 4:
                return list.get(rowIndex).getBrand().getName();
            case 5:
                return list.get(rowIndex).getTeamName();
            case 6:
                return list.get(rowIndex).getPlayerPresent();
            case 7:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    return shirt.getPlayerNameOnShirt();
                }
                return "------";
            case 8:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    return shirt.getSleeves();
                }
                return "------";
            case 9:
                return list.get(rowIndex).getNumberPresent();
            case 10:
                return list.get(rowIndex).getColor();
            case 11:
                return list.get(rowIndex).getSizeProduct();
            case 12:
                return list.get(rowIndex).getId();
        }
        return null;
    }

    @Override
    public void filter(JTable filterJtable, String[] filters) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
