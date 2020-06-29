package Control.Main;

import Control.Managers.BrandManager;
import Control.Managers.CategoryManager;
import Control.Managers.ClientManager;
import View.Main.MainView;

public class MainControl {

    private BrandManager brandManager;
    private CategoryManager categoryManager;
    private ClientManager clientManager;
    private MainView mainView;

    public MainControl() {
        brandManager = new BrandManager();
        categoryManager = new CategoryManager();
        clientManager = new ClientManager();
        mainView = new MainView(this);
    }

    public void start() {
        mainView.setVisible(true);
    }

    public void showBrandCRUD() {
        brandManager.showBrandCRUD();
    }
    
    public void showCategoryCRUD() {
        categoryManager.showCategoryCRUD();
    }
    
    public void showClientCRUD() {
        clientManager.showClientCRUD();
    }
}
