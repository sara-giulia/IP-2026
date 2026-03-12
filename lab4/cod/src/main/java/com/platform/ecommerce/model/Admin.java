package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "admins")
public class Admin extends User {

    @Column(nullable = false)
    private String department;

    public Admin() {}

    public Admin(String email, String passwordHash, String firstName,
                 String lastName, String phoneNumber, String department) {
        super(email, passwordHash, firstName, lastName, phoneNumber, UserRole.ADMIN);
        this.department = department;
    }

    public String getDepartment() { return ""; }
    public void setDepartment(String department) { throw new UnsupportedOperationException("Not implemented yet"); }
}
