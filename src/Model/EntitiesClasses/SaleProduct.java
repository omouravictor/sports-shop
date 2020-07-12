package Model.EntitiesClasses;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tbsaleproduct")
public class SaleProduct {

    @EmbeddedId
    private SaleProductId id = new SaleProductId();

    @ManyToOne
    @MapsId("saleId")
    private Sale sale;

    @ManyToOne
    @MapsId("productId")
    private Product product;

    @Column(nullable = false)
    private int qtd;

    public SaleProduct() {
    }

    public SaleProduct(Sale sale, Product product) {
        this.sale = sale;
        this.product = product;
        this.qtd = product.getQtdTransient();
    }

    public SaleProductId getId() {
        return id;
    }

    public void setId(SaleProductId id) {
        this.id = id;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SaleProduct that = (SaleProduct) o;
        return Objects.equals(sale, that.sale)
                && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sale, product);
    }
}
