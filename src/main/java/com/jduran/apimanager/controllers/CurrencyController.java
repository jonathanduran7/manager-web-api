package com.jduran.apimanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @GetMapping("/")
    public String getCurrencies() {
        return "ALL CURRENCIES";
    }

    @GetMapping("/{id}")
    public String getCurrency() {
        return "CURRENCY";
    }
}
