package Control.Managers;

import Model.EntitiesClasses.Sale;
import Model.Tables.TbClientModel;
import Model.Tables.TbProductModel;
import Model.Tables.TbSaleModel;
import View.CRUD.SaleCRUD;
import View.Forms.SaleForm;

public class SaleManager extends AbstractManager<Sale> {

    private SaleProductManager saleProManager;
    private SaleForm saleForm;
    private TbSaleModel model;
    private SaleCRUD saleCRUD;

    public SaleManager(SaleProductManager saleProManager,
            TbClientModel tbClientSearchModel, TbProductModel tbProductSearchModel) {
        this.saleProManager = saleProManager;
        saleForm = new SaleForm(null, true, tbClientSearchModel, tbProductSearchModel);
        model = new TbSaleModel(getAll(Sale.class));
        saleCRUD = new SaleCRUD(null, true, this, model);
    }

    @Override
    public Sale create() throws Exception {
        // Sends the Exception to the view
        Sale newSale = saleForm.create();
        if (newSale != null && newSale.getProductsTransient() != null) {
            saleProManager.create(newSale);
            newSale = dao.createInBank(newSale);
            return newSale;
        }
        return null;
    }

    @Override
    public void read(Sale sale) throws Exception {
        // Sends the Exception to the view
        saleForm.read(sale);
    }

    @Override
    public Sale update(Sale sale) throws Exception {
        // Sends the Exception to the view
        Sale updatedSale = saleForm.update(sale);
        if (updatedSale != null && updatedSale.getProductsTransient() != null) {
            saleProManager.delete(sale);
            saleProManager.create(updatedSale);
            updatedSale = dao.updateInBank(updatedSale);
            return updatedSale;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        saleCRUD.setVisible(true);
    }
}
