package Control;

import Model.EntitiesClasses.Brand;
import View.Forms.BrandForm;
import java.util.List;

public class BrandManager extends AbstractManager<Brand> {

    private BrandForm brandForm = new BrandForm(null, true);

    public BrandManager() {
    }

    @Override
    public Brand create() {
        Brand newBrand = brandForm.create();
        if (newBrand != null) {
            newBrand = dao.createInBank(newBrand);
            return newBrand;
        }
        return null;
    }

    @Override
    public void read(Brand brand) {
        brandForm.read(brand);
    }

    @Override
    public Brand update(Brand brand) {
        Brand updatedBrand = brandForm.update(brand);
        if (updatedBrand != null) {
            updatedBrand = dao.updateInBank(updatedBrand);
            return updatedBrand;
        }
        return null;
    }

    @Override
    public boolean delete(Brand brand) {
        return dao.deleteInBank(brand);
    }

    @Override
    public List<Brand> getAllFromBank() {
        return dao.getAllFromBank(Brand.class);
    }
}
