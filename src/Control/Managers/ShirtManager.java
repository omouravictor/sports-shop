package Control.Managers;

import Model.EntitiesClasses.Shirt;
import Model.Tables.TbBrandModel;
import Model.Tables.TbShirtModel;
import View.CRUD.ShirtCRUD;
import View.Forms.ShirtForm;

public class ShirtManager extends AbstractManager<Shirt> {

    private ShirtForm shirtForm;
    private TbShirtModel model;
    private ShirtCRUD shirtCRUD;

    public ShirtManager(TbBrandModel tbBrandSearchModel) {
        shirtForm = new ShirtForm(null, true, tbBrandSearchModel);
        model = new TbShirtModel(getAll(Shirt.class));
        shirtCRUD = new ShirtCRUD(null, true, this, model);
    }

    @Override
    public Shirt create() throws Exception {
        // Sends the Exception to the view
        Shirt newShirt = shirtForm.create();
        if (newShirt != null) {
            newShirt = dao.createInBank(newShirt);
            return newShirt;
        }
        return null;
    }

    @Override
    public void read(Shirt shirt) throws Exception {
        // Sends the Exception to the view
        shirtForm.read(shirt);
    }

    @Override
    public Shirt update(Shirt shirtSelected) throws Exception {
        // Sends the Exception to the view
        Shirt updatedShirt = shirtForm.update(shirtSelected);
        if (updatedShirt != null) {
            updatedShirt = dao.updateInBank(updatedShirt);
            return updatedShirt;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        shirtCRUD.setVisible(true);
    }
}
