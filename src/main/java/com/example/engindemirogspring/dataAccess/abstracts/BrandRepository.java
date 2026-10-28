package com.example.engindemirogspring.dataAccess.abstracts;
import java.util.List;

import com.example.engindemirogspring.entities.concretes.Brand;

public interface BrandRepository {
    List<Brand> getAll();

}
