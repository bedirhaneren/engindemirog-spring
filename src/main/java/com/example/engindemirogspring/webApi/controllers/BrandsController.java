package com.example.engindemirogspring.webApi.controllers;

import com.example.engindemirogspring.business.abstracts.BrandService;
import com.example.engindemirogspring.entities.concretes.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @RequestMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }


}
