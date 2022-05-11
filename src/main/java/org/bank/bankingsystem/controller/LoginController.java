package org.bank.bankingsystem.controller;

import org.bank.bankingsystem.entity.LoginEntity;
import org.bank.bankingsystem.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logs")
public class LoginController {
    
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public ResponseEntity<Iterable<LoginEntity>> findAll() {
        Iterable<LoginEntity> loginEntities = loginService.findAll();
        return (new ResponseEntity<>(loginEntities, HttpStatus.OK));
    }

    @GetMapping("/username")
    public ResponseEntity<Iterable<LoginEntity>> findByUsername(String username) {
        Iterable<LoginEntity> loginEntities = loginService.findByUsername(username);
        return (new ResponseEntity<>(loginEntities, HttpStatus.OK));
    }
}
