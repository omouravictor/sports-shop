package Model.ComboBoxs;

import Model.Classes.Brand;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class BrandComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private List<Brand> brandList = new ArrayList<>();
    private Brand brandSelected;

    public BrandComboBoxModel() {
    }

    @Override
    public int getSize() {
        return brandList.size();
    }

    @Override
    public Object getElementAt(int index) {
        return brandList.get(index);
    }

    @Override
    public void setSelectedItem(Object item) {
        if (item instanceof Brand) {
            brandSelected = (Brand) item;
            fireContentsChanged(brandList, 0, brandList.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return brandSelected;
    }

    public List<Brand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Brand> brandList) {
        this.brandList = brandList;
    }

    public void addBrandInCombo(Brand brand) {
        if (brand != null) {
            brandList.add(brand);
        }
    }

    public void addBrandListInCombo(List<Brand> brandList) {
        if (brandList != null) {
            this.brandList.addAll(brandList);
        }
    }

    public void clearComboBox() {
        brandList.clear();
    }
}
