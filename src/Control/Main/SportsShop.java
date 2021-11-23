package Control.Main;

import Control.Managers.BrandManager;
import Control.Managers.CategoryManager;
import Control.Managers.ClientManager;
import Control.Managers.ProductManager;
import Control.Managers.SaleManager;
import View.Main.LoginScreen;
import View.Main.MainScreen;

public class SportsShop {

    private BrandManager brandManager;
    private CategoryManager categoryManager;
    private ClientManager clientManager;
    private ProductManager productManager;
    private SaleManager saleManager;
    private MainScreen mainView;
    private LoginScreen loginView;

    public SportsShop() {
        brandManager = new BrandManager();
        categoryManager = new CategoryManager();
        clientManager = new ClientManager();
        productManager = new ProductManager(categoryManager, brandManager);
        saleManager = new SaleManager(productManager, clientManager);
        mainView = new MainScreen(this);
        loginView = new LoginScreen(mainView);
    }

    public void start() {
        loginView.setVisible(true);
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
