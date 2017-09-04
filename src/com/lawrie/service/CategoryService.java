package com.lawrie.service;

import com.lawrie.pojo.Category;
import com.lawrie.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();
    /*int total();
    List<Category>listByPage(Page page);*/
    public void delete(int id);

    public void update(Category category);
}
