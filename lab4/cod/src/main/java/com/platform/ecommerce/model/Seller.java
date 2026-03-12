package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.UserRole;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "sellers")
public class Seller extends User {

    @Column(nullable = false, unique = true)
    private String storeName;

    @Column(length = 1000)
    private String storeDescription;

    @Column(nullable = false)
    private String taxId;

    @Column(nullable = false)
    private boolean verified;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> products;

    public Seller() {}

    public Seller(String email, String passwordHash, String firstName, String lastName,
                  String phoneNumber, String storeName, String taxId) {
        super(email, passwordHash, firstName, lastName, phoneNumber, UserRole.SELLER);
        this.storeName = storeName;
        this.taxId = taxId;
        this.verified = false;
    }

    public String getStoreName() { return ""; }
    public void setStoreName(String storeName) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getStoreDescription() { return ""; }
    public void setStoreDescription(String storeDescription) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getTaxId() { return ""; }
    public boolean isVerified() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setVerified(boolean verified) { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<Product> getProducts() { throw new UnsupportedOperationException("Not implemented yet"); }
}
