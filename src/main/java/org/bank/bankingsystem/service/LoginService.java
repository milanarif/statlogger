package org.bank.bankingsystem.service;

import java.time.LocalDateTime;
import java.util.List;

import org.bank.bankingsystem.entity.LoginEntity;
import org.bank.bankingsystem.repository.LoginRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void save(String username, LocalDateTime localDatetime) {
        loginRepository.save(new LoginEntity(username, localDatetime));
    }

    public Iterable<LoginEntity> findAll() {
        return loginRepository.findAll();
    }

    public List<LoginEntity> findByUsername(String username) {
        return loginRepository.findAllByUsername(username);
    }
}
