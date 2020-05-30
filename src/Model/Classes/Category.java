package Model.Classes;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

//@Entity
//@Table(name = "tbCategory")

public class Category {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@Column
    private String name;

    public Category() {
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
