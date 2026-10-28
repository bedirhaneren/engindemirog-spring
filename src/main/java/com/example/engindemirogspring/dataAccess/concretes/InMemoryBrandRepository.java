package com.example.engindemirogspring.dataAccess.concretes;

import com.example.engindemirogspring.dataAccess.abstracts.BrandRepository;
import com.example.engindemirogspring.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {
    //globalde olmasi icin burada tanimliyor.
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
    }

    @Override
    public List<Brand> getAll() {
        return List.of();
    }
}
