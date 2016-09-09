/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask;

import com.shur.trendsofttesttask.entities.Category;
import com.shur.trendsofttesttask.entities.CategoryRepository;
import com.shur.trendsofttesttask.entities.News;
import com.shur.trendsofttesttask.entities.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * @author таня
 */
@Controller
public class NewsController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private NewsRepository newsRepository;
    
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String news(Model model) {
     List <News> allNews= (List<News>) newsRepository.findAll();
     List <Category> allCategories = (List<Category>)  categoryRepository.findAll();
      model.addAttribute("allCategories",allCategories);
      model.addAttribute("allNews",allNews);
        return "news";
    }
}
