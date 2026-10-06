package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products") // don't have to repeat products every time u put @Getmapping
public class ProductController {

    @GetMapping("/{id}") // curly braces cus ur not passing a string, ur passing a value(1,2,3)
    public Product getbyId(@PathVariable Long id){ //will capture the id???
        return new Product(id, "Laptop", 999.99); //An object???
    }
}
