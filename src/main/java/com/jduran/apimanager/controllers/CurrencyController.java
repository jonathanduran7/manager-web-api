package com.jduran.apimanager.controllers;

import com.jduran.apimanager.entities.Currency;
import com.jduran.apimanager.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/")
    @ResponseBody
    public List<Currency> getCurrencies() {
        return currencyService.findAll();
    }

    @GetMapping("/{id}")
    public String getCurrency() {
        return "CURRENCY";
    }
}
