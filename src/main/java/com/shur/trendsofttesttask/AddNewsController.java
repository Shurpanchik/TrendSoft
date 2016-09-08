/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask;

import com.shur.trendsofttesttask.entities.CategoryRepository;
import com.shur.trendsofttesttask.entities.News;
import com.shur.trendsofttesttask.entities.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 *
 * @author таня
 */

@Controller
public class AddNewsController {
    
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    
    @RequestMapping(value = "/addnews", method = RequestMethod.GET)
    public String addNewsGet(Model model) {
        model.addAttribute("news", new News());
        return "addnews";
    }
   
    @RequestMapping(value = "/addnews", method = RequestMethod.POST)
    public String addNewsPost(@ModelAttribute News news, Model model) {
        news.setDate(new Date());
        news.setCategory(categoryRepository.findOne(1));
        newsRepository.save(news);
        return "redirect:/news";
    }
}
