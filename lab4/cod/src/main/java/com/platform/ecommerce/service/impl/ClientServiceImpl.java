package com.platform.ecommerce.service.impl;

import com.platform.ecommerce.model.Address;
import com.platform.ecommerce.model.Client;
import com.platform.ecommerce.repository.ClientRepository;
import com.platform.ecommerce.service.ClientService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client register(Client client) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Optional<Client> findById(Long id) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public Client update(Client client) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void addAddress(Long clientId, Address address) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void removeAddress(Long clientId, Long addressId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public void setDefaultAddress(Long clientId, Long addressId) { throw new UnsupportedOperationException("Not implemented yet"); }

    @Override
    public List<Address> getAddresses(Long clientId) { throw new UnsupportedOperationException("Not implemented yet"); }
}
