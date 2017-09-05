package com.lawrie.controller;

import com.lawrie.pojo.Category;
import com.lawrie.pojo.Product;
import com.lawrie.service.CategoryService;
import com.lawrie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/listProduct")
    public ModelAndView list(Category category){
        Category c=categoryService.get(category.getId());

        Map m=new HashMap<>();
        m.put("category",c);
        List<Product>ps=productService.list(m);
        System.out.println(ps);
        ModelAndView mav=new ModelAndView("listProduct");
        mav.addObject("ps",ps);

        return mav;
    }

    @RequestMapping("/addProduct")
    public ModelAndView addProduct(Product product){
        System.out.println(product);
        productService.add(product);
        int cid=product.getCategory().getId();
        ModelAndView mav=new ModelAndView("redirect:/listProduct?id="+cid);
        return mav;
    }

    @RequestMapping("/deleteProduct")
    public ModelAndView deleteProduct(Product product){
        Product p=productService.get(product.getId());
        productService.delete(product.getId());
        int cid=p.getCategory().getId();
        ModelAndView mav=new ModelAndView("redirect:/listProduct?id="+cid);
        return mav;
    }

    @RequestMapping("/editProduct")
    public ModelAndView editProduct(Product product) {
        ModelAndView mav=new ModelAndView("editProduct");
        Product p=productService.get(product.getId());
        mav.addObject("product",p);
        return mav;
    }

    @RequestMapping("/updateProduct")
    public ModelAndView updateProduct(Product product){
        productService.update(product);
        int cid=productService.get(product.getId()).getCategory().getId();
        ModelAndView mav=new ModelAndView("redirect:/listProduct?id="+cid);
        return mav;
    }

}
