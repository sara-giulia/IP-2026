package com.platform.ecommerce.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ShippingAddress {

    private String street;
    private String city;
    private String county;
    private String postalCode;
    private String country;

    public ShippingAddress() {}

    public ShippingAddress(String street, String city, String county,
                           String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static ShippingAddress fromAddress(Address address) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getStreet() { return ""; }
    public String getCity() { return ""; }
    public String getCounty() { return ""; }
    public String getPostalCode() { return ""; }
    public String getCountry() { return ""; }
    public String getFormattedAddress() { return ""; }
}
