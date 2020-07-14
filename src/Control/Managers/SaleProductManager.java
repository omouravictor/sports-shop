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

    public SaleProduct create(Sale newSale, Product proSale) throws Exception {
        // Sends the Exception to the SaleManager
        SaleProduct dataSalePro = new SaleProduct(newSale, proSale);
        return dataSalePro;
    }
}
