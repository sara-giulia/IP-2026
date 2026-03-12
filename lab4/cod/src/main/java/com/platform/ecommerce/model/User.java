package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.UserRole;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    protected User() {}

    protected User(String email, String passwordHash, String firstName,
                   String lastName, String phoneNumber, UserRole role) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.active = true;
    }

    @PrePersist
    protected void onCreate() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PreUpdate
    protected void onUpdate() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getEmail() { return ""; }
    public void setEmail(String email) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getPasswordHash() { return ""; }
    public void setPasswordHash(String passwordHash) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getFirstName() { return ""; }
    public void setFirstName(String firstName) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getLastName() { return ""; }
    public void setLastName(String lastName) { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getPhoneNumber() { return ""; }
    public void setPhoneNumber(String phoneNumber) { throw new UnsupportedOperationException("Not implemented yet"); }
    public UserRole getRole() { throw new UnsupportedOperationException("Not implemented yet"); }
    public boolean isActive() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void setActive(boolean active) { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getUpdatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getFullName() { return ""; }
}
