package Model.EntitiesClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "Product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Product_Inheritance", discriminatorType = DiscriminatorType.STRING)
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private double cost = 0;

    @Transient
    private int quantity;

    @Column(nullable = false)
    private int numInStock = 0;

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SaleProduct> sales = new ArrayList<>();

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
        setCost(product.getCost());
        setNumInStock(product.getNumInStock());
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
        setCost(cost);
        setNumInStock(numInStock);
    }

    public List<SaleProduct> getSales() {
        return sales;
    }

    public void setSales(List<SaleProduct> sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product pro = (Product) o;
        return Objects.equals(category, pro.category)
                && Objects.equals(brand, pro.brand)
                && Objects.equals(teamName, pro.teamName)
                && Objects.equals(playerPresent, pro.playerPresent)
                && Objects.equals(numberPresent, pro.numberPresent)
                && Objects.equals(sizeProduct, pro.sizeProduct)
                && Objects.equals(color, pro.color)
                && Objects.equals(cost, pro.cost)
                && Objects.equals(numInStock, pro.numInStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, brand, teamName, playerPresent,
                numberPresent, sizeProduct, color, cost, numInStock);
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
