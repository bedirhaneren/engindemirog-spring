package com.example.engindemirogspring.webApi.controllers;

import com.example.engindemirogspring.business.abstracts.BrandService;
import com.example.engindemirogspring.business.requests.CreateBrandRequest;
import com.example.engindemirogspring.business.responses.GetAllBrandsResponse;
import com.example.engindemirogspring.dataAccess.abstracts.BrandRepository;
import com.example.engindemirogspring.entities.concretes.Brand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandRepository brandRepository;
    private BrandService brandService;
    public BrandsController(BrandService brandService, BrandRepository brandRepository) {
        this.brandService = brandService;
        this.brandRepository = brandRepository;
    }
    @RequestMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest)
    {
        this.brandService.add(createBrandRequest);
    }
}
