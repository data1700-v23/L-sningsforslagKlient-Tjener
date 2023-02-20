package com.example.ukesoppgaverklienttjener.Controller;

import com.example.ukesoppgaverklienttjener.Models.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController()
public class CurrencyController {

    private ArrayList<Currency> currencyRegister = new ArrayList<>(){
        {
            add(new Currency("USD", 8.5));
            add(new Currency("EUR", 10.0));
            add(new Currency("GBP", 11.0));
            add(new Currency("SEK", 1.0));
        }
    };

    @GetMapping("/currency")
    public double getCurrency(String type, double amount){
        for(Currency currency : currencyRegister){
            if(currency.getType().equals(type)){
                double value = currency.getRate() * amount;
                return value;
            }
        }

        return 0;
    }

}
