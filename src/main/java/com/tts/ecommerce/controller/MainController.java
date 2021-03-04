package com.tts.ecommerce.controller;

import com.tts.ecommerce.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@Data
@ControllerAdvice
public class MainController {

    @Autowired
    ProductService productService;

    @GetMapping(value = {"/", "/main"})
    public String main() { return "main"; }

    @ModelAttribute("products") {
        public List<Product> products(){
            return productService.findAll();
        }

    @ModelAttribute("categories") {
        public List<String> categories() {
            return productService.findDistinctCategories();
            }
        }
    }

}
