package Model.EntitiesClasses;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Product_Inheritance", discriminatorType = DiscriminatorType.STRING)
@Table(name = "tbProduct")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne(optional = false)
    private Brand brand;

    @Column(length = 100, nullable = false)
    private String teamName;

    @Column(length = 100, nullable = true)
    private String playerPresent = "------";

    @Column(length = 100, nullable = true)
    private String numberPresent = "------";

    @Column(length = 100, nullable = false)
    private String sizeProduct;

    @Column(length = 100, nullable = false)
    private String color;

    @Column(nullable = false)
    private double cost = 0;

    @Column(nullable = false)
    private int quantity = 0;

    @Column(nullable = false)
    private int numInStock = 0;

    public Product() {
    }

    public Product(Category category, Brand brand, String teamName,
            String playerPresentName, String numberPresent, String color,
            String sizeProduct, double cost, int quantity, int numInStock) {
        this.category = category;
        this.brand = brand;
        this.teamName = teamName;
        setPlayerPresent(playerPresentName);
        setNumberPresent(numberPresent);
        this.color = color;
        this.sizeProduct = sizeProduct;
        setCost(cost);
        setQuantity(quantity);
        setNumInStock(numInStock);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getPlayerPresent() {
        return playerPresent;
    }

    public void setPlayerPresent(String playerPresentName) {
        if (playerPresentName != null && !playerPresentName.isEmpty()) {
            this.playerPresent = playerPresentName;
        }
    }

    public String getSizeProduct() {
        return sizeProduct;
    }

    public void setSizeProduct(String sizeProduct) {
        this.sizeProduct = sizeProduct;
    }

    public String getNumberPresent() {
        return numberPresent;
    }

    public void setNumberPresent(String numberPresent) {
        if (numberPresent != null && !numberPresent.isEmpty()) {
            this.numberPresent = numberPresent;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        if (numInStock >= 0) {
            this.numInStock = numInStock;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
