/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gymgroup.controller;

import com.gymgroup.entities.Product;
import com.gymgroup.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alex
 */
@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    ProductService service;
    
    @GetMapping
    public ResponseEntity<List<Product>> AllProducts() {
        List<Product> list = service.getAllProducts();
        return ResponseEntity.ok().body(list);
    }
    
    
}
