package com.project.urlshortner.url_shortener.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.urlshortner.url_shortener.ApplicationProperties;
import com.project.urlshortner.url_shortener.domain.models.PagedResult;
import com.project.urlshortner.url_shortener.domain.models.ShortUrlDto;
import com.project.urlshortner.url_shortener.domain.services.ShortUrlService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ShortUrlService shortUrlService;
    private final ApplicationProperties properties;

    public AdminController(ShortUrlService shortUrlService, ApplicationProperties properties) {
        this.shortUrlService = shortUrlService;
        this.properties = properties;
    }

    @GetMapping("/dashboard")
    public String dashboard(
            @RequestParam(defaultValue = "1") int page,
            Model model) {
        PagedResult<ShortUrlDto> allUrls = shortUrlService.findAllShortUrls(page, properties.pageSize());
        model.addAttribute("shortUrls", allUrls);
        model.addAttribute("baseUrl", properties.baseUrl());
        model.addAttribute("paginationUrl", "/admin/dashboard");
        return "admin-dashboard";
    }
}