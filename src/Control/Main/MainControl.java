package Control.Main;

import Control.Managers.BrandManager;
import Control.Managers.CategoryManager;
import Control.Managers.ClientManager;
import Control.Managers.ProductManager;
import Control.Managers.SaleManager;
import Control.Managers.ShirtManager;
import View.Main.MainView;

public class MainControl {

    private BrandManager brandManager;
    private CategoryManager categoryManager;
    private ClientManager clientManager;
    private ProductManager productManager;
    private ShirtManager shirtManager;
    private SaleManager saleManager;
    private MainView mainView;

    public MainControl() {
        brandManager = new BrandManager();
        categoryManager = new CategoryManager();
        clientManager = new ClientManager();
        productManager = new ProductManager(categoryManager.getModel(), brandManager.getModel());
        shirtManager = new ShirtManager(brandManager.getModel());
        saleManager = new SaleManager(clientManager.getModel(), productManager.getModel2());
        mainView = new MainView(this);
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
    
    public void showShirtCRUD() {
        shirtManager.showCRUDscreen();
    }
    
    public void showSaleCRUD() {
        saleManager.showCRUDscreen();
    }
}
