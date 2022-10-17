package site.telion.skyprolesson211.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.telion.skyprolesson211.service.ShoppingCartService;

import java.util.Set;

@RestController
@RequestMapping("/order")
@Scope("session")
public class ShoppingCartController {

    ShoppingCartService service;

    public ShoppingCartController(ShoppingCartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Set<Integer> addProductToShoppingCart(@RequestParam(name = "productid", required = false) String productIdList) {
        return service.addProduct(productIdList);
    }

    @GetMapping("/get")
    public Set<Integer> getAllProductsFromShoppingCart() {
        return service.getAllProduct();
    }
}
