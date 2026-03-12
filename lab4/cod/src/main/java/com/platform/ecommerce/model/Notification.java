package com.platform.ecommerce.model;

import com.platform.ecommerce.model.enums.NotificationType;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User recipient;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NotificationType type;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false, length = 2000)
    private String message;

    @Column(nullable = false)
    private boolean sent;

    private LocalDateTime sentAt;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public Notification() {}

    public Notification(User recipient, NotificationType type, String subject, String message) {
        this.recipient = recipient;
        this.type = type;
        this.subject = subject;
        this.message = message;
        this.sent = false;
    }

    @PrePersist
    protected void onCreate() { throw new UnsupportedOperationException("Not implemented yet"); }

    public Long getId() { throw new UnsupportedOperationException("Not implemented yet"); }
    public User getRecipient() { throw new UnsupportedOperationException("Not implemented yet"); }
    public NotificationType getType() { throw new UnsupportedOperationException("Not implemented yet"); }
    public String getSubject() { return ""; }
    public String getMessage() { return ""; }
    public boolean isSent() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getSentAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public LocalDateTime getCreatedAt() { throw new UnsupportedOperationException("Not implemented yet"); }
    public void markAsSent() { throw new UnsupportedOperationException("Not implemented yet"); }
}
