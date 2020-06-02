package Model.Classes;

import java.util.ArrayList;
import java.util.List;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;*/
//@Entity
//Table(name = "tbRequest")
public class Sale {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@ManyToOne
    private Client client;

    //@ManyToMany
    /*@JoinTable(name = "Requests_Products",
    joinColumns = @JoinColumn(name = "Request_id"),
    inverseJoinColumns = @JoinColumn(name = "Product_id"))*/
    private List<Product> productList = new ArrayList<>();

    //@Column(length = 10) // 10 because of the mask
    private String requestDate;

    //@Column(precision = 2)
    private double requestCost;

    public Sale() {
    }

    public Sale(Client client, List<Product> productList, String requestDate) {
        this.client = client;
        this.productList = productList;
        this.requestDate = requestDate;
        this.setRequestCost(calcRequestCost());
    }

    public double calcRequestCost() {
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

    public void setClient(Client requestClient) {
        this.client = requestClient;
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

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestCost(double requestCost) {
        this.requestCost = requestCost;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public double getRequestCost() {
        return requestCost;
    }
}
