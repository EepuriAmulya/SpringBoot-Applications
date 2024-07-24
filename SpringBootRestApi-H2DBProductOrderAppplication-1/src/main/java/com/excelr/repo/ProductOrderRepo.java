package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.ProductOrder;

@Repository
public interface ProductOrderRepo extends CrudRepository<ProductOrder, Integer> {

}
