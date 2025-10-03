package com.productcatalog.service;

import java.util.List;
import java.util.Optional;

import com.productcatalog.model.Product;

public interface IProductCataloService {
List<Product> getAll();

List<Product> getByCategory(String category);

Optional<Product> getById(int id);
}
