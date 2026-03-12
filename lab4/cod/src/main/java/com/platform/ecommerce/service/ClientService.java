package com.platform.ecommerce.service;

import com.platform.ecommerce.model.Address;
import com.platform.ecommerce.model.Client;
import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client register(Client client);
    Optional<Client> findById(Long id);
    Client update(Client client);
    void addAddress(Long clientId, Address address);
    void removeAddress(Long clientId, Long addressId);
    void setDefaultAddress(Long clientId, Long addressId);
    List<Address> getAddresses(Long clientId);
}
