package com.lawrie.service.impl;

import com.lawrie.mapper.CategoryMapper;
import com.lawrie.pojo.Category;
import com.lawrie.service.CategoryService;
import com.lawrie.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    /*@Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public List<Category> listByPage(Page page) {
        return categoryMapper.listByPage(page);
    }*/

    public void delete(int id){
        categoryMapper.delete(id);
    }

    public void update(Category category){
        categoryMapper.update(category);
    }

    public void add(Category category){
        categoryMapper.add(category);
    }

}
