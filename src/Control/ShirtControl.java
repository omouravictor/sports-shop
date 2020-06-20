package Control;

import Model.EntitiesClasses.Shirt;
import View.Forms.ShirtForm;

public class ShirtControl {

    private ShirtForm shirtForm = new ShirtForm(null, true);

    public ShirtControl() {
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
