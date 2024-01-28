package com.jduran.apimanager.services;

import com.jduran.apimanager.entities.Currency;

import java.util.List;

public interface CurrencyService {
    List<Currency> findAll();

    Currency findById(Long id);

    Currency save(Currency currency);

    Currency update(Currency currency, Long id);

    void deleteById(Long id);
}
