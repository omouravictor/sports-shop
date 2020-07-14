package Control.Managers;

import Model.EntitiesClasses.Category;
import Model.Tables.TbCategoryModel;
import View.CRUD.CategoryCRUD;
import View.Forms.CategoryForm;

public class CategoryManager extends AbstractManager<Category> {

    private CategoryForm categoryForm;
    private TbCategoryModel model;
    private CategoryCRUD categoryCRUD;

    public CategoryManager() {
        categoryForm = new CategoryForm(null, true);
        model = new TbCategoryModel(getAll(Category.class));
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
    public Category update(Category category) throws Exception {
        // Sends the Exception to the view
        category = categoryForm.update(category);
        if (category != null) {
            category = dao.updateInBank(category);
            return category;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        categoryCRUD.setVisible(true);
    }

    public TbCategoryModel getModel() {
        return model;
    }
}
