package Control;

import Model.EntitiesClasses.Product;
import View.Forms.ProductForm;

public class ProductManager {

    private ProductForm productForm = new ProductForm(null, true);

    public ProductManager() {
    }

    public Product create() {
        Product newProduct = productForm.create();
        return newProduct;
    }

    public void read(Product product) {
        productForm.read(product);
    }

    public Product update(Product product) {
        Product updatedProduct = productForm.update(product);
        return updatedProduct;
    }

    public boolean delete(Product product) {
        return product != null;
    }

}
