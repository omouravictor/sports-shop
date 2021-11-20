package Model.EntitiesClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbcategory")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    public Category() {
    }
    
    public Category(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public Category(String categoryName) {
        this.name = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String categoryName) {
        this.name = categoryName;
    }

    @Override
    public String toString() {
        return name; //Used to print the name in the combo box
    }
}
