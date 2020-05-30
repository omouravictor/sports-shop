package Model.ComboBoxs;

import Model.Classes.Category;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class CategoryComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private List<Category> categoryList = new ArrayList<>();
    private Category categorySelected;

    public CategoryComboBoxModel() {
    }

    @Override
    public int getSize() {
        return categoryList.size();
    }

    @Override
    public Object getElementAt(int index) {
        return categoryList.get(index);
    }

    @Override
    public void setSelectedItem(Object item) {
        if (item instanceof Category) {
            categorySelected = (Category) item;
            fireContentsChanged(categoryList, 0, categoryList.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return categorySelected;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void addCategoryInCombo(Category category) {
        if (category != null) {
            categoryList.add(category);
        }
    }

    public void addCategoryListInCombo(List<Category> categoryList) {
        if (categoryList != null) {
            this.categoryList.addAll(categoryList);
        }
    }

    public void clearComboBox() {
        categoryList.clear();
    }
}
