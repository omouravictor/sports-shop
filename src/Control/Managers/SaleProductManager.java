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

    public void updateSaleProduct(Sale sale) throws Exception {
        // Sends the Exception to the SaleManager
        dao.getEntityManager().clear();
        for (int i = 0; i < sale.getSaleProducts().size(); i++) {
            dao.deleteInBank(sale.getSaleProducts().get(i));
        }
        sale.getSaleProducts().clear();
        for (Product proTran : sale.getProductsTransient()) {
            SaleProduct salePro = new SaleProduct(sale, proTran);
            sale.getSaleProducts().add(dao.createInBank(salePro));
        }
    }
}
