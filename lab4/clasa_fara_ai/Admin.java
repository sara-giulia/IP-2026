package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "admins")
public class Admin extends User {

    private String department;
    private boolean superAdmin;

    public Admin() {}

    public Admin(String email, String passwordHash, String firstName,
                 String lastName, String phoneNumber, String department) {
        super(email, passwordHash, firstName, lastName, phoneNumber, UserRole.ADMIN);
        this.department = department;
        this.superAdmin = false;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public boolean isSuperAdmin() { return superAdmin; }
    public void setSuperAdmin(boolean superAdmin) { this.superAdmin = superAdmin; }

    @Override
    public String toString() { return ""; }
}