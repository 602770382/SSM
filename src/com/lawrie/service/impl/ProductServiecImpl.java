package com.lawrie.service.impl;

import com.lawrie.mapper.ProductMapper;
import com.lawrie.pojo.Product;
import com.lawrie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiecImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> list(Map map) {
        return productMapper.list(map);
    }

    @Override
    public void add(Product product) {
        productMapper.add(product);
    }

    @Override
    public void delete(int id) {
        productMapper.delete(id);
    }

    @Override
    public Product get(int id) {
        return productMapper.get(id);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }
}
