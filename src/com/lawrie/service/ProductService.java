package com.lawrie.service;

import com.lawrie.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public List<Product> list(Map map);

    public void add(Product product);

    public void delete(int id);

    public Product get(int id);

    public void update(Product product);
}
