package Control.Main;

import Control.Managers.BrandManager;
import Control.Managers.CategoryManager;
import Control.Managers.ClientManager;
import Control.Managers.ProductManager;
import Control.Managers.SaleManager;
import Control.Managers.SaleProductManager;
import View.Main.MainScreen;

public class SportsShop {

    private BrandManager brandManager;
    private CategoryManager categoryManager;
    private ClientManager clientManager;
    private ProductManager productManager;
    private SaleProductManager saleProManager;
    private SaleManager saleManager;
    private MainScreen mainView;

    public SportsShop() {
        brandManager = new BrandManager();
        categoryManager = new CategoryManager();
        clientManager = new ClientManager();
        productManager = new ProductManager(categoryManager.getModel(), brandManager.getModel());
        saleProManager = new SaleProductManager();
        saleManager = new SaleManager(saleProManager, clientManager.getModel(), productManager.getModel());
        mainView = new MainScreen(this);
    }

    public void start() {
        mainView.setVisible(true);
    }

    public void showBrandCRUD() {
        brandManager.showCRUDscreen();
    }

    public void showCategoryCRUD() {
        categoryManager.showCRUDscreen();
    }

    public void showClientCRUD() {
        clientManager.showCRUDscreen();
    }

    public void showProductCRUD() {
        productManager.showCRUDscreen();
    }

    public void showSaleCRUD() {
        saleManager.showCRUDscreen();
    }
}
