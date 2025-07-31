package com.project.urlshortner.url_shortener.web.controllers;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.project.urlshortner.url_shortener.domain.entities.User;
import com.project.urlshortner.url_shortener.domain.services.UserService;

@Component
public class SecurityUtils {
    private final UserService userService;

    public SecurityUtils(UserService userService) {
        this.userService = userService;
    }

    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String email = authentication.getName();
            return userService.findByEmail(email).orElse(null);
        }
        return null;
    }

    public Long getCurrentUserId() {
        User user = getCurrentUser();
        return user != null ? user.getId() : null;
    }
}