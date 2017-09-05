package com.lawrie.service.impl;

import com.lawrie.mapper.CategoryMapper;
import com.lawrie.pojo.Category;
import com.lawrie.service.CategoryService;
import com.lawrie.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName ="Exception" )
    public void addTwo() {
        Category c1 = new Category();
        c1.setName("短的名字");
        categoryMapper.add(c1);

        Category c2 = new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
        categoryMapper.add(c2);
    }

    @Override
    public void deleteAll() {
        List<Category> cs = list();
        for (Category c : cs) {

            categoryMapper.delete(c.getId());
        }
    }

}
