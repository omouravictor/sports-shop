package Control.Managers;

import Model.EntitiesClasses.Brand;
import View.Forms.BrandForm;
import java.util.List;

public class BrandManager extends AbstractManager<Brand> {

    private BrandForm brandForm = new BrandForm(null, true);

    public BrandManager() {
    }

    @Override
    public Brand create() throws Exception {
        // Sends the Exception to the view
        Brand newBrand = brandForm.create();
        if (newBrand != null) {
            newBrand = dao.createInBank(newBrand);
            return newBrand;
        }
        return null;
    }

    @Override
    public void read(Brand brand) throws Exception {
        // Sends the Exception to the view
        brandForm.read(brand);
    }

    @Override
    public Brand update(Brand brandSelected) throws Exception {
        // Sends the Exception to the view
        Brand updatedBrand = brandForm.update(brandSelected);
        if (updatedBrand != null) {
            updatedBrand = dao.updateInBank(updatedBrand);
            return updatedBrand;
        }
        return null;
    }

    @Override
    public boolean delete(Brand brand) throws Exception {
        // Sends the Exception to the view
        return dao.deleteInBank(brand);
    }

    @Override
    public List<Brand> getAll() {
        return dao.getAllFromBank(Brand.class);
    }
}
