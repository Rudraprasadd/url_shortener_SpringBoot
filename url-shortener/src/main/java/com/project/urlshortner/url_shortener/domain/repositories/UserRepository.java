package com.project.urlshortner.url_shortener.domain.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.urlshortner.url_shortener.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}