package Model.Classes;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Shirt")

public class Shirt extends Product {

    @Column(length = 100, nullable = true)
    private String playerNameOnShirt = "------";

    @Enumerated(EnumType.STRING)
    private Sleeves sleeves;

    public Shirt() {
    }

    public Shirt(Category category, Brand brand, String teamName,
            String playerPresentName, String playerNameOnShirt,
            String numberPresent, Sleeves sleeves, String color,
            String sizeProduct, double cost, int quantity, int numInStock) {
        this.setCategory(category);
        this.setBrand(brand);
        this.setTeamName(teamName);
        this.setPlayerPresent(playerPresentName);
        setPlayerNameOnShirt(playerNameOnShirt);
        this.setNumberPresent(numberPresent);
        this.sleeves = sleeves;
        this.setColor(color);
        this.setSizeProduct(sizeProduct);
        this.setCost(cost);
        this.setQuantity(quantity);
        this.setNumInStock(numInStock);
    }

    public String getPlayerNameOnShirt() {
        return playerNameOnShirt;
    }

    public void setPlayerNameOnShirt(String playerNameOnShirt) {
        if (playerNameOnShirt != null) {
            this.playerNameOnShirt = playerNameOnShirt;
        }
    }

    public Sleeves getSleeves() {
        return sleeves;
    }

    public void setSleeves(Sleeves sleeves) {
        this.sleeves = sleeves;
    }
}
