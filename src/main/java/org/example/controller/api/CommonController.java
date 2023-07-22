package org.example.controller.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class CommonController {
    private int cartItems = 1;

    @PostMapping("/update-quantity/{inc}")
    public @ResponseBody String updateQuantity(@PathVariable("inc") int increment) {
        cartItems += increment;
        return String.valueOf(cartItems);
    }

    @PostMapping("/add-to-cart")
    public String addToCart(){
        return String.valueOf(cartItems);
    }

    @GetMapping("/test")
    public String testUrl(){
        return "successfully loaded api";
    }
}
