/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask;

import com.shur.trendsofttesttask.entities.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shur.trendsofttesttask.entities.Category;
import com.shur.trendsofttesttask.entities.NewsRepository;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author таня
 */
@Controller
public class NewsController {
     @Autowired
    private NewsRepository newsRepository;
    
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String news(Model model) {
      List<News> allNews= (List<News>) newsRepository.findAll();
      model.addAttribute("allNews",allNews);
        return "news";
    }
}
