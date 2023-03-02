package com.example.ukesoppgaverklienttjener.Controller;

import com.example.ukesoppgaverklienttjener.Models.Currency;
import com.example.ukesoppgaverklienttjener.Models.CurrencyValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController()
public class CurrencyController {

    private ArrayList<Currency> currencyRegister = new ArrayList<>();
    @PostMapping("/load")
    public void loadCurrencies(){
        currencyRegister.add(new Currency("USD", 8.5));
        currencyRegister.add(new Currency("EUR", 10.0));
        currencyRegister.add(new Currency("GBP", 11.0));
        currencyRegister.add(new Currency("SEK", 1.1));
    }

    @PostMapping("/getCurrencies")
    public ArrayList<Currency> getCurrencies(){
        return currencyRegister;
    }

    @PostMapping("/calculateValue")
    public double calculateValue(CurrencyValue currencyValue){
        for(Currency currency : currencyRegister){
            if(currency.getCurrency().equalsIgnoreCase(currencyValue.getCurrency())){
                return currency.getRate() * currencyValue.getAmount();
            }
        }
        return 0;
    }

}
