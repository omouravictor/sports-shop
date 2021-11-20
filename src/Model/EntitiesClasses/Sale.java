package Model.EntitiesClasses;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbsale")

public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @ManyToOne(optional = false)
    private Client client;
    
    @Column(nullable = false, length = 10)
    private String saleDate;
    
    @Column(nullable = false)
    private double saleCost;
    
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<SaleProduct> saleProducts;
    
    @Transient
    private List<Product> productsTransient;
    
    public Sale() {
        this.saleProducts = new ArrayList<>();
        this.productsTransient = new ArrayList<>();
    }
    
    public Sale(Sale sale) {
        this.id = sale.getId();
        this.client = sale.getClient();
        this.saleDate = sale.getSaleDate();
        this.saleCost = sale.getSaleCost();
        this.saleProducts = new ArrayList<>();
        this.setSaleProducts(sale.getSaleProducts());
        this.productsTransient = new ArrayList<>();
    }
    
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (SaleProduct dataSalePro : saleProducts) {
            Product pro = dataSalePro.getProduct();
            pro.setQtdTransient(dataSalePro.getQtd());
            products.add(pro);
        }
        return products;
    }
    
    public List<Product> getProductsTransient() {
        return productsTransient;
    }
    
    public void setProductsTransient(List<Product> productsTransient) {
        this.productsTransient.clear();
        this.productsTransient.addAll(productsTransient);
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
    
    public List<SaleProduct> getSaleProducts() {
        return saleProducts;
    }
    
    public void setSaleProducts(List<SaleProduct> saleProducts) {
        this.saleProducts.clear();
        this.saleProducts.addAll(saleProducts);
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
