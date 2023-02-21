package com.example.ukesoppgaverklienttjener.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add(String field1, String field2) {
        try {
            double a = Double.parseDouble(field1);
            double b = Double.parseDouble(field2);
            return Double.toString(a+b);

        }
        catch (Exception e){
            return "Error";
        }
    }

    @GetMapping("/subtract")
    public String subtract(String field1, String field2) {
        try {
            double a = Double.parseDouble(field1);
            double b = Double.parseDouble(field2);
            return Double.toString(a-b);

        }
        catch (Exception e){
            return "Error";
        }
    }
    @GetMapping("/multiply")
    public String multiply(String field1, String field2) {
        try {
            double a = Double.parseDouble(field1);
            double b = Double.parseDouble(field2);

            return Double.toString(a*b);
        }
        catch (Exception e){
            return "Error";
        }
    }
    @GetMapping("/divide")
    public String divide(String field1, String field2) {
        try {
            double a = Double.parseDouble(field1);
            double b = Double.parseDouble(field2);

            if (b==0){
                return "Error cannot divide by 0";
            }

            return Double.toString(a/b);
        }
        catch (Exception e){
            return "Error";
        }
    }
}
