package Model.Classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbSale")

public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    private Client client;

    @ManyToMany
    @JoinTable(name = "Sales_Products",
            joinColumns = @JoinColumn(name = "Sale_id"),
            inverseJoinColumns = @JoinColumn(name = "Product_id"))
    private List<Product> productList = new ArrayList<>();

    @Column(length = 10)
    private String saleDate;

    @Column(precision = 2)
    private double saleCost;

    public Sale() {
    }

    public Sale(Client client, List<Product> productList, String saleDate) {
        this.client = client;
        this.productList = productList;
        this.saleDate = saleDate;
        this.setSaleCost(calcSaleCost());
    }

    public double calcSaleCost() {
        if (!productList.isEmpty()) {
            double total = 0;
            for (int i = 0; i < productList.size(); i++) {
                total += productList.get(i).getCost();
            }
            return total;
        }
        return 0;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client saleClient) {
        this.client = saleClient;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProductList(List<Product> productList) {
        this.productList.addAll(productList);
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleCost(double saleCost) {
        this.saleCost = saleCost;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public double getSaleCost() {
        return saleCost;
    }
}
