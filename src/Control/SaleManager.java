package Control;

import Model.EntitiesClasses.Sale;
import View.Forms.SaleForm;

public class SaleManager {

    private SaleForm saleForm = new SaleForm(null, true);

    public SaleManager() {
    }

    public Sale create() {
        Sale newSale = saleForm.create();
        return newSale;
    }

    public void read(Sale sale) {
        saleForm.read(sale);
    }

    public Sale update(Sale sale) {
        Sale updatedSale = saleForm.update(sale);
        return updatedSale;
    }

    public boolean delete(Sale sale) {
        return sale != null;
    }
}
