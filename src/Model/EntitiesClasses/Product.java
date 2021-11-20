package Model.EntitiesClasses;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Product_Inheritance", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Common")
@Table(name = "tbproduct")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(optional = true)
    // Optional because category of "Shirt" always gonna be SHIRT
    private Category category;

    @ManyToOne(optional = false)
    private Brand brand;

    @Column(length = 100, nullable = false)
    private String teamName;

    @Column(length = 100, nullable = true)
    private String playerPresent;

    @Column(length = 100, nullable = true)
    private String numberPresent;

    @Column(length = 100, nullable = false)
    private String sizeProduct;

    @Column(length = 100, nullable = false)
    private String color;

    @Column(nullable = false)
    private double cost;

    @Column(nullable = false)
    private int numInStock;

    @Transient
    private int qtdTransient;

    public Product() {
    }

    public Product(Product product) {
        this.id = product.getId();
        this.category = product.getCategory();
        this.brand = product.getBrand();
        this.teamName = product.getTeamName();
        setPlayerPresent(product.getPlayerPresent());
        setNumberPresent(product.getNumberPresent());
        this.color = product.getColor();
        this.sizeProduct = product.getSizeProduct();
        this.cost = product.getCost();
        this.numInStock = product.getNumInStock();
    }

    public Product(Category category, Brand brand, String teamName,
            String playerPresentName, String numberPresent, String color,
            String sizeProduct, double cost, int numInStock) {
        this.category = category;
        this.brand = brand;
        this.teamName = teamName;
        setPlayerPresent(playerPresentName);
        setNumberPresent(numberPresent);
        this.color = color;
        this.sizeProduct = sizeProduct;
        this.cost = cost;
        this.numInStock = numInStock;
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
        this.cost = cost;
    }

    public int getQtdTransient() {
        return qtdTransient;
    }

    public void setQtdTransient(int qtdTransient) {
        this.qtdTransient = qtdTransient;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
