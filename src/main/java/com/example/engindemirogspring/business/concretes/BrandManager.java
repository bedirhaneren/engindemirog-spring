package com.example.engindemirogspring.business.concretes;

import com.example.engindemirogspring.business.abstracts.BrandService;
import com.example.engindemirogspring.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {

    private BrandService brandService;
    @Override
    public List<Brand> getAll() {
        return List.of();
    }
}
