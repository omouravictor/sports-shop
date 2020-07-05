package Model.Tables;

import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Shirt;

public class TbAddedProductModel extends AbstractTbModel<Product> {

    public TbAddedProductModel() {
        this.columnNames = new String[]{"QTD", "Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getQuantity();
            case 1:
                return list.get(rowIndex).getNumInStock();
            case 2:
                return costFormatter.formatCost(list.get(rowIndex).getCost());
            case 3:
                if (list.get(rowIndex) instanceof Shirt) {
                    return "Shirt";
                }
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
}
