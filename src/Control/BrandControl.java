package Control;

import Model.Entities.Brand;
import View.Forms.BrandForm;

public class BrandControl {

    private BrandForm brandForm = new BrandForm(null, true);

    public BrandControl() {
    }

    public Brand create() {
        Brand newBrand = brandForm.create();
        return newBrand;
    }

    public void read(Brand brand) {
        brandForm.read(brand);
    }

    public Brand update(Brand brand) {
        Brand updatedBrand = brandForm.update(brand);
        return updatedBrand;
    }

    public boolean delete(Brand brand) {
        return brand != null;
    }

}
