package Control.Managers;

import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Sale;
import Model.EntitiesClasses.SaleProduct;
import Model.Tables.TbSaleModel;
import View.CRUD.SaleCRUD;
import View.Forms.SaleForm;

public class SaleManager extends AbstractManager<Sale> {

    private ProductManager productManager;
    private TbSaleModel tbSaleModel;
    private SaleForm saleForm;
    private SaleCRUD saleCRUD;

    public SaleManager(ProductManager productManager, ClientManager clientManager) {
        this.productManager = productManager;
        saleForm = new SaleForm(null, true, clientManager.getTbClientModel(),
                productManager.getTbProductModel());
        tbSaleModel = new TbSaleModel(getAll(Sale.class));
        saleCRUD = new SaleCRUD(null, true, this, tbSaleModel);
    }

    @Override
    public Sale create() throws Exception {
        // Sends the Exception to the view
        Sale newSale = saleForm.create();
        if (newSale != null) {
            newSale = dao.createInBank(newSale);
            for (Product product : newSale.getProducts()) {
                int numInStock = product.getNumInStock();
                int qtdTransient = product.getQtdTransient();
                product.setNumInStock(numInStock - qtdTransient);
                productManager.updateProductStock(product);
            }
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
        if (sale != null) {
            sale = dao.updateInBank(sale);
            return sale;
        }
        return null;
    }

    @Override
    public void delete(Sale sale) throws Exception {
        // Sends the Exception to the view
        dao.deleteInBank(sale);
        for (SaleProduct salePro : sale.getSaleProducts()) {
            Product product = salePro.getProduct();
            int numInStock = product.getNumInStock();
            int qtd = salePro.getQtd();
            product.setNumInStock(numInStock + qtd);
            productManager.updateProductStock(product);
        }
    }

    @Override
    public void showCRUDscreen() {
        saleCRUD.setVisible(true);
    }
}
