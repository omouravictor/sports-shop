package Model.EntitiesClasses;

import Model.Classes.SleeveTypes;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Shirt's")

public class Shirt extends Product {

    @Column(length = 100, nullable = true)
    private String playerNameOnShirt;

    @Enumerated(EnumType.STRING)
    private SleeveTypes sleeves;

    public Shirt() {
    }
    
    public Shirt(Shirt shirt) {
        this.setId(shirt.getId());
        this.setCategory(shirt.getCategory());
        this.setBrand(shirt.getBrand());
        this.setTeamName(shirt.getTeamName());
        this.setPlayerPresent(shirt.getPlayerPresent());
        setPlayerNameOnShirt(shirt.getPlayerNameOnShirt());
        this.setNumberPresent(shirt.getNumberPresent());
        this.sleeves = shirt.getSleeves();
        this.setColor(shirt.getColor());
        this.setSizeProduct(shirt.getSizeProduct());
        this.setCost(shirt.getCost());
        this.setQtdSale(shirt.getQtdSale());
        this.setNumInStock(shirt.getNumInStock());
    }

    public Shirt(Category category, Brand brand, String teamName,
            String playerPresentName, String playerNameOnShirt,
            String numberPresent, SleeveTypes sleeves, String color,
            String sizeProduct, double cost, int qtdSale, int numInStock) {
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
        this.setQtdSale(qtdSale);
        this.setNumInStock(numInStock);
    }

    public String getPlayerNameOnShirt() {
        return playerNameOnShirt;
    }

    public void setPlayerNameOnShirt(String playerNameOnShirt) {
        if (playerNameOnShirt != null && !playerNameOnShirt.isEmpty()) {
            this.playerNameOnShirt = playerNameOnShirt;
        }
    }

    public SleeveTypes getSleeves() {
        return sleeves;
    }

    public void setSleeves(SleeveTypes sleeves) {
        this.sleeves = sleeves;
    }
}
