package Control;

import Model.Entities.Category;
import View.Forms.CategoryForm;

public class CategoryControl {

    private CategoryForm categoryForm = new CategoryForm(null, true);

    public CategoryControl() {
    }

    public Category create() {
        Category newCategory = categoryForm.create();
        return newCategory;
    }

    public void read(Category category) {
        categoryForm.read(category);
    }

    public Category update(Category category) {
        Category updatedCategory = categoryForm.update(category);
        return updatedCategory;
    }

    public boolean delete(Category category) {
        return category != null;
    }

}
