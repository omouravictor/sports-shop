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

    public void create(Sale sale) throws Exception {
        // Sends the Exception to the SaleManager
        for (Product product : sale.getProductsTransient()) {
            SaleProduct salePro = new SaleProduct(sale, product);
            sale.getSaleProducts().add(salePro);
        }
    }

    public void delete(Sale sale) throws Exception {
        // Sends the Exception to the SaleManager
        for (SaleProduct salePro : sale.getSaleProducts()) {
            dao.deleteInBank(salePro);
        }
    }
}
