package Control;

import Model.EntitiesClasses.Category;
import View.Forms.CategoryForm;

public class CategoryManager extends AbstractManager {

    private CategoryForm categoryForm = new CategoryForm(null, true);

    public CategoryManager() {
    }

    @Override
    public Object create() {
        Object newCategory = categoryForm.create();
        if (newCategory != null) {
            newCategory = dao.createInBank(newCategory);
            return newCategory;
        }
        return null;
    }

    @Override
    public void read(Object category) {
        categoryForm.read((Category) category);
    }

    @Override
    public Object update(Object category) {
        Object updatedCategory = categoryForm.update((Category) category);
        if (updatedCategory != null) {
            updatedCategory = dao.updateInBank(updatedCategory);
            return updatedCategory;
        }
        return null;
    }

    @Override
    public boolean delete(Object category) {
        return dao.deleteInBank(category);
    }
}
