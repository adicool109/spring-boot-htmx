package org.example.controller.ui;

import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String loadIndexHtmx(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "index";
    }
}
