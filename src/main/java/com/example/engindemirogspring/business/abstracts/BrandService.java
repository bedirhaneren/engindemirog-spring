package com.example.engindemirogspring.business.abstracts;

import com.example.engindemirogspring.business.requests.CreateBrandRequest;
import com.example.engindemirogspring.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
