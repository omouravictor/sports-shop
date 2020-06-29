package Control.Managers;

import Model.EntitiesClasses.Category;
import Model.Tables.TbCategoryModel;
import View.CRUD.CategoryCRUD;
import View.Forms.CategoryForm;
import java.util.List;

public class CategoryManager extends AbstractManager<Category> {

    private CategoryForm categoryForm;
    private TbCategoryModel model;
    private CategoryCRUD categoryCRUD;

    public CategoryManager() {
        categoryForm = new CategoryForm(null, true);
        model = new TbCategoryModel(getAll());
        categoryCRUD = new CategoryCRUD(null, true, this, model);
    }

    @Override
    public Category create() throws Exception {
        // Sends the Exception to the view
        Category newCategory = categoryForm.create();
        if (newCategory != null) {
            newCategory = dao.createInBank(newCategory);
            return newCategory;
        }
        return null;
    }

    @Override
    public void read(Category category) throws Exception {
        // Sends the Exception to the view
        categoryForm.read(category);
    }

    @Override
    public Category update(Category categorySelected) throws Exception {
        // Sends the Exception to the view
        Category updatedCategory = categoryForm.update(categorySelected);
        if (updatedCategory != null) {
            updatedCategory = dao.updateInBank(updatedCategory);
            return updatedCategory;
        }
        return null;
    }

    @Override
    public void delete(Category category) throws Exception {
        // Sends the Exception to the view
        dao.deleteInBank(category);
    }

    @Override
    public List<Category> getAll() {
        return dao.getAllFromBank(Category.class);
    }

    public void showCategoryCRUD() {
        categoryCRUD.setVisible(true);
    }
}
