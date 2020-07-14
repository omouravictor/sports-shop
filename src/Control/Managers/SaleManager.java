package Control.Managers;

import Model.EntitiesClasses.Sale;
import Model.Tables.TbClientModel;
import Model.Tables.TbProductModel;
import Model.Tables.TbSaleModel;
import View.CRUD.SaleCRUD;
import View.Forms.SaleForm;

public class SaleManager extends AbstractManager<Sale> {

    private SaleProductManager saleProductManager;
    private SaleForm saleForm;
    private TbSaleModel model;
    private SaleCRUD saleCRUD;

    public SaleManager(SaleProductManager saleProductManager,
            TbClientModel tbClientSearchModel,
            TbProductModel tbProductSearchModel) {
        this.saleProductManager = saleProductManager;
        saleForm = new SaleForm(null, true, tbClientSearchModel,
                tbProductSearchModel);
        model = new TbSaleModel(getAll(Sale.class));
        saleCRUD = new SaleCRUD(null, true, this, model);
    }

    @Override
    public Sale create() throws Exception {
        // Sends the Exception to the view
        Sale newSale = saleForm.create();
        if (newSale != null && newSale.getProductsTransient() != null) {
            saleProductManager.addSaleProduct(newSale);
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
        sale = saleForm.update(sale);
        if (sale != null && sale.getProductsTransient() != null) {
            saleProductManager.updateSaleProduct(sale);
            sale = dao.updateInBank(sale);
            return sale;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        saleCRUD.setVisible(true);
    }
}
