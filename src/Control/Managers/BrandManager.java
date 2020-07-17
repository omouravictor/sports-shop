package Control.Managers;

import Model.EntitiesClasses.Brand;
import Model.Tables.TbBrandModel;
import View.CRUD.BrandCRUD;
import View.Forms.BrandForm;

public class BrandManager extends AbstractManager<Brand> {

    private BrandForm brandForm;
    private TbBrandModel tbBrandModel;
    private BrandCRUD brandCRUD;

    public BrandManager() {
        brandForm = new BrandForm(null, true);
        tbBrandModel = new TbBrandModel(getAll(Brand.class));
        brandCRUD = new BrandCRUD(null, true, this, tbBrandModel);
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
    public Brand update(Brand brand) throws Exception {
        // Sends the Exception to the view
        brand = brandForm.update(brand);
        if (brand != null) {
            brand = dao.updateInBank(brand);
            return brand;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        brandCRUD.setVisible(true);
    }

    public TbBrandModel getTbBrandModel() {
        return tbBrandModel;
    }
}
