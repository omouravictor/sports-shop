package Model.EntitiesClasses;

import java.util.ArrayList;
import java.util.Iterator;
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

@Entity(name = "Sale")
@Table(name = "sale")

public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    private Client client;

    @OneToMany(
            mappedBy = "sale",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SaleProduct> products = new ArrayList<>();

    @Column(length = 10)
    private String saleDate;

    @Column(precision = 2)
    private double saleCost;

    public Sale() {
    }

    public Sale(Sale sale) {
        this.client = sale.getClient();
        this.products = sale.getProducts();
        this.saleDate = sale.getSaleDate();
        this.setSaleCost(calcSaleCost());
    }

    public Sale(Client client, List<SaleProduct> products, String saleDate) {
        this.client = client;
        this.products = products;
        this.saleDate = saleDate;
        this.setSaleCost(calcSaleCost());
    }

    public void addProduct(Product pro) {
        SaleProduct salePro = new SaleProduct(this, pro);
        products.add(salePro);
        pro.getSales().add(salePro);
    }

    public void removeProduct(Product pro) {
        for (Iterator<SaleProduct> iterator = products.iterator();
                iterator.hasNext();) {
            SaleProduct salePro = iterator.next();
            if (salePro.getSale().equals(this)
                    && salePro.getProduct().equals(pro)) {
                iterator.remove();
                salePro.getProduct().getSales().remove(salePro);
                salePro.setSale(null);
                salePro.setProduct(null);
            }
        }
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

    public double calcSaleCost() {
        if (!products.isEmpty()) {
            double total = 0;
            for (int i = 0; i < products.size(); i++) {
                total += products.get(i).getQtd() * products.get(i).getProduct().getCost();
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

    public List<SaleProduct> getProducts() {
        return products;
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
