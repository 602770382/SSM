package com.lawrie.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lawrie.pojo.Category;
import com.lawrie.service.CategoryService;
import com.lawrie.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/listCategory")
    public ModelAndView listCategory(Page page){
        ModelAndView mav=new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Category>cs=categoryService.list();
        int total=(int)new PageInfo<>(cs).getTotal();
        /*List<Category> cs=categoryService.listByPage(page);
        int total=categoryService.total();*/

        page.caculateLast(total);

        //放入转发参数
        mav.addObject("cs",cs);
        //放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }

    @RequestMapping("/deleteCategory")
    public ModelAndView deleteCategory(Category category){
        categoryService.delete(category.getId());
        ModelAndView mav=new ModelAndView("redirect:/listCategory");
        return mav;
    }

    @RequestMapping("/editCategory")
    public ModelAndView editCategory(Category category){
        ModelAndView mav=new ModelAndView("editCategory");
        return mav;
    }

    @RequestMapping("/updateCategory")
    public ModelAndView updateCategory(Category category){
        categoryService.update(category);
        ModelAndView mav=new ModelAndView("redirect:/listCategory");
        return mav;
    }



}
