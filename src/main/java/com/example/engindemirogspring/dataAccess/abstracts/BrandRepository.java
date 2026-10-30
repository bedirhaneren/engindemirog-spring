package com.example.engindemirogspring.dataAccess.abstracts;

import com.example.engindemirogspring.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
