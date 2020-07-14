package Control.Managers;

import Model.EntitiesClasses.Product;
import Model.EntitiesClasses.Shirt;
import Model.Tables.TbBrandModel;
import Model.Tables.TbCategoryModel;
import Model.Tables.TbProductModel;
import View.CRUD.ProductCRUD;
import View.Forms.ProductForm;
import View.Forms.ShirtsForm;

public class ProductManager extends AbstractManager<Product> {

    private ProductForm commonForm;
    private ShirtsForm shirtForm;
    private TbProductModel model;
    private ProductCRUD productCRUD;

    public ProductManager(TbCategoryModel tbCategorySearchModel, TbBrandModel tbBrandSearchModel) {
        commonForm = new ProductForm(null, true, tbCategorySearchModel, tbBrandSearchModel);
        shirtForm = new ShirtsForm(null, true, tbBrandSearchModel);
        model = new TbProductModel(getAll(Product.class));
        productCRUD = new ProductCRUD(null, true, this, model);
    }

    public Product create(int parameter) throws Exception {
        // Sends the Exception to the view
        if (parameter == 0) {
            Product newProduct = commonForm.create();
            if (newProduct != null) {
                newProduct = dao.createInBank(newProduct);
                return newProduct;
            }
        } else if (parameter == 1) {
            Shirt newShirt = shirtForm.create();
            if (newShirt != null) {
                newShirt = (Shirt) dao.createInBank(newShirt);
                return newShirt;
            }
        }
        return null;
    }

    @Override
    public void read(Product product) throws Exception {
        // Sends the Exception to the view
        if (product instanceof Shirt) {
            shirtForm.read((Shirt) product);
        } else {
            commonForm.read(product);
        }
    }

    @Override
    public Product update(Product product) throws Exception {
        // Sends the Exception to the view
        if (product instanceof Shirt) {
            product = (Shirt) shirtForm.update((Shirt) product);
            if (product != null) {
                product = (Shirt) dao.updateInBank(product);
                return product;
            }
        } else {
            product = commonForm.update(product);
            if (product != null) {
                product = dao.updateInBank(product);
                return product;
            }
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

    @Override
    public Product create() throws Exception {
        return null;
    }
}
