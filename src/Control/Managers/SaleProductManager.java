package Control.Managers;

import Control.DAO.DAO;
import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Sale;
import Model.EntitiesClasses.SaleProduct;

public class SaleProductManager {

    protected DAO<SaleProduct> dao;

    public SaleProductManager() {
        dao = new DAO() {
        };
    }

    public void addSaleProduct(Sale sale) throws Exception {
        // Sends the Exception to the SaleManager
        for (Product proTran : sale.getProductsTransient()) {
            sale.getSaleProducts().add(new SaleProduct(sale, proTran));
        }
    }
}
