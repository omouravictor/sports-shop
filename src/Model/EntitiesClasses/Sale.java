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

@Entity
@Table(name = "tbsale")

public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private Client client;

    @Column(length = 10)
    private String saleDate;

    @Column(nullable = false)
    private double saleCost;

    @OneToMany(
            mappedBy = "sale",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SaleProductTb> dataSaleProductTb = new ArrayList<>();

    public Sale() {
    }

    public Sale(Sale sale) {
        this.id = sale.getId();
        this.client = sale.getClient();
        this.saleDate = sale.getSaleDate();
        this.saleCost = sale.getSaleCost();
        this.dataSaleProductTb = sale.getDataSaleProductTb();
    }

    public void addProducts(List<Product> products) {
        for (Product pro : products) {
            SaleProductTb dataSalePro = new SaleProductTb(this, pro);
            dataSaleProductTb.add(dataSalePro);
            pro.getDataSaleProductTb().add(dataSalePro);
        }
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (SaleProductTb dataSalePro : dataSaleProductTb) {
            Product pro = dataSalePro.getProduct();
            pro.setQtdSale(dataSalePro.getQtd());
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

    public List<SaleProductTb> getDataSaleProductTb() {
        return dataSaleProductTb;
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
