package org.bank.bankingsystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private LocalDateTime localDatetime;

    public LoginEntity() {
    }

    public LoginEntity(String username, LocalDateTime localDatetime) {
        this.username = username;
        this.localDatetime = localDatetime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getLocalDatetime() {
        return localDatetime;
    }

    public void setLocalDatetime(LocalDateTime localDatetime) {
        this.localDatetime = localDatetime;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "username='" + username + '\'' +
                ", localDatetime=" + localDatetime +
                '}';
    }
}
