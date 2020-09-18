package com.org.hotels.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collections;
import java.util.List;

@RestController
public class HotelsController {
    @GetMapping("/hotels")
    public List<HotelResponse> getHotels(){
        return Collections.singletonList(new HotelResponse());
    }

}
