package Control.Managers;

import Model.EntitiesClasses.Brand;
import Model.EntitiesClasses.Category;
import Model.EntitiesClasses.Product;
import View.Forms.ProductForm;
import java.util.List;

public class ProductManager extends AbstractManager<Product> {

    private List<Product> allProducts = dao.getAllFromBank(Product.class);
    private ProductForm productForm = new ProductForm(null, true);
    private List<Category> allCategories;
    private List<Brand> allBrands;

    public ProductManager(List<Category> allCategories, List<Brand> allBrands) {
        this.allCategories = allCategories;
        this.allBrands = allBrands;
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
    public void delete(Product product) throws Exception {
        // Sends the Exception to the view
        dao.deleteInBank(product);
    }

    @Override
    public List<Product> getAll() {
        return dao.getAllFromBank(Product.class);
    }

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }
}
