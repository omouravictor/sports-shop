package Model.EntitiesClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private Client client;

    @Column(nullable = false, length = 10)
    private String saleDate;

    @Column(nullable = false)
    private double saleCost;

    @OneToMany(mappedBy = "sale", cascade = {CascadeType.ALL})
    private List<SaleProduct> saleProducts = new ArrayList<>();

    @Transient
    private List<Product> productsTransient = new ArrayList<>();
    
    public Sale() {
    }

    public Sale(Sale sale) {
        this.id = sale.getId();
        this.client = sale.getClient();
        this.saleDate = sale.getSaleDate();
        this.saleCost = sale.getSaleCost();
        this.saleProducts = sale.getSaleProducts();
    }

    public List<Product> getProductsTransient() {
        return productsTransient;
    }

    public void setProductsTransient(List<Product> productsTransient) {
        this.productsTransient.clear();
        this.productsTransient.addAll(productsTransient);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sale sale = (Sale) o;
        return Objects.equals(client, sale.client)
                && Objects.equals(saleDate, sale.saleDate)
                && Objects.equals(saleCost, sale.saleCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, saleDate, saleCost);
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
