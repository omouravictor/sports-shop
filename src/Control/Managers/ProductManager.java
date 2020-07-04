package Control.Managers;

import Model.EntitiesClasses.Product;
import Model.Tables.TbBrandModel;
import Model.Tables.TbCategoryModel;
import Model.Tables.TbProductModel;
import View.CRUD.ProductCRUD;
import View.Forms.ProductForm;
import View.Forms.ShirtForm;

public class ProductManager extends AbstractManager<Product> {

    private ProductForm productForm;
    private ShirtForm shirtForm;
    private TbProductModel model;
    private ProductCRUD productCRUD;

    public ProductManager(TbCategoryModel tbCategorySearchModel, TbBrandModel tbBrandSearchModel) {
        productForm = new ProductForm(null, true, tbCategorySearchModel, tbBrandSearchModel);
        shirtForm = new ShirtForm(null, true, tbBrandSearchModel);
        model = new TbProductModel(getAll(Product.class));
        productCRUD = new ProductCRUD(null, true, this, model);
    }

    @Override
    public Product create() throws Exception {
        // Sends the Exception to the view
        Product newProduct = productForm.create();
        if (newProduct != null) {
            newProduct = dao.createInBank(newProduct);
            return newProduct;
        }
        return null;
    }

    @Override
    public void read(Product product) throws Exception {
        // Sends the Exception to the view
        productForm.read(product);
    }

    @Override
    public Product update(Product productSelected) throws Exception {
        // Sends the Exception to the view
        Product updatedProduct = productForm.update(productSelected);
        if (updatedProduct != null) {
            updatedProduct = dao.updateInBank(updatedProduct);
            return updatedProduct;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        productCRUD.setVisible(true);
    }

    public TbProductModel getModel() {
        return model;
    }
}
