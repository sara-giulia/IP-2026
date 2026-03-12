package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.UserRole;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends User {

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Cart cart;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Client() {}

    public Client(String email, String passwordHash, String firstName,
                  String lastName, String phoneNumber) {
        super(email, passwordHash, firstName, lastName, phoneNumber, UserRole.CLIENT);
    }

    public List<Address> getAddresses() { throw new UnsupportedOperationException("Not implemented yet"); }
    public Cart getCart() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setCart(Cart cart) { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<Order> getOrders() { throw new UnsupportedOperationException("Not implemented yet"); }
    public List<Review> getReviews() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void addAddress(Address address) { throw new UnsupportedOperationException("Not implemented yet"); }
    public void removeAddress(Address address) { throw new UnsupportedOperationException("Not implemented yet"); }
}
