package com.jduran.apimanager.services.impl;

import com.jduran.apimanager.entities.Currency;
import com.jduran.apimanager.repositories.CurrencyRepository;
import com.jduran.apimanager.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;
    @Override
    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency findById(Long id) {
        return  currencyRepository.findById(id).orElse(null);
    }

    @Override
    public Currency save(Currency currency) {
        return currencyRepository.save(currency);
    }

    @Override
    public Currency update(Currency currency, Long id) {

        Currency currencyToUpdate = currencyRepository.findById(id).orElse(null);

        if(currencyToUpdate != null){
            return currencyRepository.save(currency);
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        currencyRepository.deleteById(id);
    }
}
