package Control.Managers;

import Model.EntitiesClasses.Sale;
import Model.Tables.TbClientModel;
import Model.Tables.TbProductModel;
import Model.Tables.TbSaleModel;
import View.CRUD.SaleCRUD;
import View.Forms.SaleForm;

public class SaleManager extends AbstractManager<Sale> {

    private SaleForm saleForm;
    private TbSaleModel model;
    private SaleCRUD saleCRUD;

    public SaleManager(TbClientModel tbClientSearchModel, TbProductModel tbProductSearchModel) {
        saleForm = new SaleForm(null, true, tbClientSearchModel, tbProductSearchModel);
        model = new TbSaleModel(getAll(Sale.class));
        saleCRUD = new SaleCRUD(null, true, this, model);
    }

    @Override
    public Sale create() throws Exception {
        // Sends the Exception to the view
        Sale newSale = saleForm.create();
        if (newSale != null) {
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
    public Sale update(Sale saleSelected) throws Exception {
        // Sends the Exception to the view
        Sale updatedSale = saleForm.update(saleSelected);
        if (updatedSale != null) {
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
