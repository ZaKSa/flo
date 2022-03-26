package com.flo.flo.repo;

import com.flo.flo.models.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {
}
