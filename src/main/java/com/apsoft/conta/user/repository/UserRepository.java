package com.apsoft.conta.user.repository;

import com.apsoft.conta.user.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
    Optional<User> findByTokenReset(String tokenReset);



    @Transactional
    void deleteById(long id);



    @Transactional
    @Query(value = "SELECT * FROM users", nativeQuery=true)
    ArrayList<User> viewAllUsers();

}
