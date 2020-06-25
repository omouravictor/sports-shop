package Control.Managers;

import Model.EntitiesClasses.Shirt;
import View.Forms.ShirtForm;

public class ShirtManager {

    private ShirtForm shirtForm = new ShirtForm(null, true);

    public ShirtManager() {
    }

    public Shirt create() {
        Shirt newShirt = shirtForm.create();
        return newShirt;
    }

    public void read(Shirt shirt) {
        shirtForm.read(shirt);
    }

    public Shirt update(Shirt shirt) {
        Shirt updatedShirt = shirtForm.update(shirt);
        return updatedShirt;
    }

    public boolean delete(Shirt shirt) {
        return shirt != null;
    }

}
