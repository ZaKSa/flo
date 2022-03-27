package com.flo.flo.repo;

import com.flo.flo.models.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Products, Long> {
}
