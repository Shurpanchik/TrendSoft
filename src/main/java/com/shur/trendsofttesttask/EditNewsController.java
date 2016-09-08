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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author таня
 */
@Controller
public class EditNewsController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private NewsRepository newsRepository;

        @RequestMapping(value = "/editnews/{id}", method = RequestMethod.GET)
    public String editNewsGet(@PathVariable(value="id")int id ,Model model) {
        News newsToEdit = newsRepository.findOne(id);
        model.addAttribute("news", newsToEdit);
        return "/editnews";
    }
    @RequestMapping(value = "/editnews/{id}", method = RequestMethod.POST)
    public String editNewsPost(@PathVariable("id") int id,@ModelAttribute News news, Model model) {
            news.setId(id);
            newsRepository.save(news);
            return "redirect:/news";
    }
}
