package Control;

import Model.EntitiesClasses.Brand;
import View.Forms.BrandForm;

public class BrandManager extends AbstractManager {

    private BrandForm brandForm = new BrandForm(null, true);

    public BrandManager() {
    }

    @Override
    public Object create() {
        Object newBrand = brandForm.create();
        if (newBrand != null) {
            newBrand = dao.createInBank(newBrand);
            return newBrand;
        }
        return null;
    }

    @Override
    public void read(Object brand) {
        brandForm.read((Brand) brand);
    }

    @Override
    public Object update(Object brand) {
        Object updatedBrand = brandForm.update((Brand) brand);
        if (updatedBrand != null) {
            updatedBrand = dao.updateInBank(updatedBrand);
            return updatedBrand;
        }
        return null;
    }

    @Override
    public boolean delete(Object brand) {
        return dao.deleteInBank(brand);
    }
}
