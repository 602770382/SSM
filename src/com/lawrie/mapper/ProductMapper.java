package com.lawrie.mapper;

import com.lawrie.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    public void add(Product p);

    public void delete(int id);

    public void update(Product p);

    public Product get(int id);

    public List<Product> list(Map map);
}
