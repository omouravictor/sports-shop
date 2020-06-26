package Control.Managers;

import Model.EntitiesClasses.Category;
import View.Forms.CategoryForm;
import java.util.List;

public class CategoryManager extends AbstractManager<Category> {

    private CategoryForm categoryForm = new CategoryForm(null, true);

    public CategoryManager() {
    }

    @Override
    public Category create() throws Exception {
        Category newCategory = categoryForm.create();
        if (newCategory != null) {
            newCategory = dao.createInBank(newCategory);
            return newCategory;
        }
        return null;
    }

    @Override
    public void read(Category category) throws Exception {
        categoryForm.read(category);
    }

    @Override
    public Category update(Category category) throws Exception {
        Category updatedCategory = categoryForm.update(category);
        if (updatedCategory != null) {
            updatedCategory = dao.updateInBank(updatedCategory);
            return updatedCategory;
        }
        return null;
    }

    @Override
    public void delete(Category category) throws Exception {
        dao.deleteInBank(category);
    }

    @Override
    public List<Category> getAll() {
        return dao.getAllFromBank(Category.class);
    }
}
