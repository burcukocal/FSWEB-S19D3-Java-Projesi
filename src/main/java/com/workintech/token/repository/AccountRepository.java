package com.workintech.token.repository;

import com.workintech.token.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("SELECT a FROM Account a WHERE a.name = :name")
    Optional<Account> findByName(String name);
}
