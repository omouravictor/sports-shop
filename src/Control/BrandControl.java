package Control;

import Model.Entities.Brand;
import View.Forms.BrandForm;

public class BrandControl {

    private BrandForm brandForm = new BrandForm(null, true);

    public BrandControl() {
    }

    public Brand create() {
        Brand newBrand = brandForm.create();
        if (newBrand != null) {
            return newBrand;
        }
        return null;
    }

    public void read(Brand brand) {
        if (brand != null) {
            brandForm.read(brand);
        }
    }

    public Brand update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Brand delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
