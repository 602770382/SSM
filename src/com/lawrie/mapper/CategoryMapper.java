package com.lawrie.mapper;

import com.lawrie.pojo.Category;
import com.lawrie.util.Page;

import java.util.List;

public interface CategoryMapper {
    public void add(Category c);

    public void delete(int id);

    public void update(Category c);

    public Category get(int id);

    public List<Category> list();

    /*public List<Category>listByPage(Page page);*/

    public int total();
}
