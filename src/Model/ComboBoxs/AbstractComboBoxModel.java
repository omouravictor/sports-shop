package Model.ComboBoxs;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public abstract class AbstractComboBoxModel<T> extends AbstractListModel implements ComboBoxModel {

    protected List<T> list = new ArrayList<>();
    protected T objectSelected;

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    }

    @Override
    public void setSelectedItem(Object item) {
        objectSelected = (T) item;
        fireContentsChanged(list, 0, list.size());
    }

    @Override
    public Object getSelectedItem() {
        return objectSelected;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> tList) {
        this.list = tList;
    }

    public void addObjectInCombo(T t) {
        if (t != null) {
            list.add(t);
        }
    }

    public void addObjectListInCombo(List<T> tList) {
        if (tList != null) {
            this.list.addAll(tList);
        }
    }

    public void clearComboBox() {
        list.clear();
    }
}
