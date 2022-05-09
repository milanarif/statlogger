package org.bank.bankingsystem.repository;

import java.util.List;

import org.bank.bankingsystem.entity.LoginEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<LoginEntity, Long> {
    List<LoginEntity> findAllByUsername(String username);
}
