package Control.Main;

import Control.Managers.BrandManager;
import View.Main.MainView;

public class MainControl {

    private BrandManager brandManager;
    private MainView mainView;

    public MainControl() {
        brandManager = new BrandManager();
        mainView = new MainView(this);
    }

    public void start() {
        mainView.setVisible(true);
    }

    public void showBrandCRUD() {
        brandManager.showBrandCRUD();
    }
}
