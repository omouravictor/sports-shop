package Model.EntitiesClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbbrand")

public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    public Brand() {
    }

    public Brand(Brand brand) {
        this.id = brand.getId();
        this.name = brand.getName();
    }

    public Brand(String nameBrand) {
        this.name = nameBrand;
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

    public void setName(String nameBrand) {
        this.name = nameBrand;
    }

    @Override
    public String toString() {
        return name;
    }
}
