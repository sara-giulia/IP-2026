package com.platform.ecommerce;

import com.platform.ecommerce.model.Admin;
import com.platform.ecommerce.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        Admin admin = new Admin("admin@shop.com", "hash123", "Ion", "Popescu", "0700000000", "IT");
        admin.setSuperAdmin(true);
        System.out.println(admin.isSuperAdmin());

        Client client = new Client("ion@gmail.com", "hash456", "Ion", "Ionescu", "0711111111");
        System.out.println(client.getFullProfile());
    }
}
