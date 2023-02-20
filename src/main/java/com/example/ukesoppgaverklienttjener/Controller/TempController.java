package com.example.ukesoppgaverklienttjener.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    @GetMapping("/temp")
    public int getTemp(int month){
        if(month<1 || month>12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        return tempArray[month-1];

    }


}
