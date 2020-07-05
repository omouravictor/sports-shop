package Model.EntitiesClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbClient")

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 14, nullable = false, unique = true)
    private String CPF;

    @Column(length = 14, nullable = false)
    private String cellPhone;

    @Column(length = 100, nullable = true, unique = true)
    private String email;

    @Column(length = 9, nullable = false)
    private String zipCodeAddress;

    @Column(length = 100, nullable = false)
    private String streetAddress;

    @Column(length = 9, nullable = false)
    private String numberAddress;

    @Column(length = 100, nullable = false)
    private String neighborhoodAddress;

    @Column(length = 100, nullable = false)
    private String cityAddress;

    @Column(length = 2, nullable = false)
    private String stateAddress;

    public Client() {
    }
    
    public Client(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.CPF = client.getCpf();
        this.cellPhone = client.getCellPhone();
        this.email = client.getEmail();
        this.zipCodeAddress = client.getZipCodeAddress();
        this.streetAddress = client.getStreetAddress();
        this.numberAddress = client.getNumberAddress();
        this.neighborhoodAddress = client.getNeighborhoodAddress();
        this.cityAddress = client.getCityAddress();
        this.stateAddress = client.getStateAddress();
    }

    public Client(String name, String CPF, String cellPhone, String email,
            String zipCodeAddress, String streetAddress, String numberAddress,
            String neighborhoodAddress, String cityAddress, String stateAddress) {
        this.name = name;
        this.CPF = CPF;
        this.cellPhone = cellPhone;
        this.email = email;
        this.zipCodeAddress = zipCodeAddress;
        this.streetAddress = streetAddress;
        this.numberAddress = numberAddress;
        this.neighborhoodAddress = neighborhoodAddress;
        this.cityAddress = cityAddress;
        this.stateAddress = stateAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public String getZipCodeAddress() {
        return zipCodeAddress;
    }

    public void setZipCodeAddress(String zipCodeAddress) {
        this.zipCodeAddress = zipCodeAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getNumberAddress() {
        return numberAddress;
    }

    public void setNumberAddress(String numberAddress) {
        this.numberAddress = numberAddress;
    }

    public String getNeighborhoodAddress() {
        return neighborhoodAddress;
    }

    public void setNeighborhoodAddress(String neighborhoodAddress) {
        this.neighborhoodAddress = neighborhoodAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getStateAddress() {
        return stateAddress;
    }

    public void setStateAddress(String stateAddress) {
        this.stateAddress = stateAddress;
    }
}
