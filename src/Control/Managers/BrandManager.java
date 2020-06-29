package Control.Managers;

import Model.EntitiesClasses.Brand;
import Model.Tables.TbBrandModel;
import View.CRUD.BrandCRUD;
import View.Forms.BrandForm;
import java.util.List;

public class BrandManager extends AbstractManager<Brand> {

    private BrandForm brandForm;
    private TbBrandModel model;
    private BrandCRUD brandCRUD;

    public BrandManager() {
        brandForm = new BrandForm(null, true);
        model = new TbBrandModel(getAll());
        brandCRUD = new BrandCRUD(null, true, this, model);
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
    public void delete(Brand brand) throws Exception {
        // Sends the Exception to the view
        dao.deleteInBank(brand);
    }

    @Override
    public List<Brand> getAll() {
        return dao.getAllFromBank(Brand.class);
    }

    @Override
    public void showCRUDscreen() {
        brandCRUD.setVisible(true);
    }
}
