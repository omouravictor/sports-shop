package Model.EntitiesClasses;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tbsaleproduct")
public class SaleProductTb {

    @EmbeddedId
    private SaleProductEmbeddable id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("saleId")
    private Sale sale;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;

    @Column(nullable = false)
    private int qtd;

    public SaleProductTb() {
    }

    public SaleProductTb(Sale sale, Product product) {
        this.sale = sale;
        this.product = product;
        this.qtd = product.getQtdSale();
        this.id = new SaleProductEmbeddable(sale.getId(), product.getId());
    }

    public SaleProductEmbeddable getId() {
        return id;
    }

    public void setId(SaleProductEmbeddable id) {
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

        SaleProductTb that = (SaleProductTb) o;
        return Objects.equals(sale, that.sale)
                && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sale, product);
    }
}
