package Control.Main;

import Control.Managers.BrandManager;
import Control.Managers.CategoryManager;
import View.Main.MainView;

public class MainControl {

    private BrandManager brandManager;
    private CategoryManager categoryManager;
    private MainView mainView;

    public MainControl() {
        brandManager = new BrandManager();
        categoryManager = new CategoryManager();
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
}
