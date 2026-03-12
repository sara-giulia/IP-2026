package com.platform.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String county;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private boolean defaultAddress;

    public Address() {}

    public Address(Client client, String street, String city,
                   String county, String postalCode, String country) {
        this.client = client;
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.country = country;
        this.defaultAddress = false;
    }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Client getClient() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setClient(Client client) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getStreet() { return ""; }
    public void setStreet(String street) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getCity() { return ""; }
    public void setCity(String city) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getCounty() { return ""; }
    public void setCounty(String county) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getPostalCode() { return ""; }
    public void setPostalCode(String postalCode) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getCountry() { return ""; }
    public void setCountry(String country) { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isDefaultAddress() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setDefaultAddress(boolean defaultAddress) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getFormattedAddress() { return ""; }
}
