package Model.Tables;

import Model.Classes.SleeveTypes;
import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Shirt;

public class TbAddedProductModel extends AbstractTbModel<Product> {

    public TbAddedProductModel() {
        this.columnNames = new String[]{"QTD", "ID", "Stock", "Cost", "Category",
            "Brand", "Team", "Player", "ShirtName", "Sleeves", "Number",
            "Color", "Size", "Id"};
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getQtdTransient();
            case 1:
                return list.get(rowIndex).getId();
            case 2:
                return list.get(rowIndex).getNumInStock();
            case 3:
                return costFormatter.formatCost(list.get(rowIndex).getCost());
            case 4:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    if (shirt.getSleeves().equals(SleeveTypes.NoSleeves)) {
                        return "T-Shirt";
                    }
                    return "Shirt";
                }
                return list.get(rowIndex).getCategory().getName();
            case 5:
                return list.get(rowIndex).getBrand().getName();
            case 6:
                return list.get(rowIndex).getTeamName();
            case 7:
                if (list.get(rowIndex).getPlayerPresent() == null
                        || list.get(rowIndex).getPlayerPresent().isEmpty()) {
                    return "------";
                }
                return list.get(rowIndex).getPlayerPresent();
            case 8:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    if (shirt.getPlayerNameOnShirt() == null
                            || shirt.getPlayerNameOnShirt().isEmpty()) {
                        return "------";
                    }
                    return shirt.getPlayerNameOnShirt();
                }
                return "------";
            case 9:
                if (list.get(rowIndex) instanceof Shirt) {
                    Shirt shirt = (Shirt) list.get(rowIndex);
                    return shirt.getSleeves();
                }
                return "------";
            case 10:
                if (list.get(rowIndex).getNumberPresent() == null
                        || list.get(rowIndex).getNumberPresent().isEmpty()) {
                    return "------";
                }
                return list.get(rowIndex).getNumberPresent();
            case 11:
                return list.get(rowIndex).getColor();
            case 12:
                return list.get(rowIndex).getSizeProduct();
        }
        return null;
    }
}
