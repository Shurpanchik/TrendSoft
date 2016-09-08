/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask;

import com.shur.trendsofttesttask.entities.News;
import com.shur.trendsofttesttask.entities.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *
 * @author таня
 */
@Controller
public class SearchNewsController {
     @Autowired
    private NewsRepository newsRepository;
    @RequestMapping(value = "/searchnews" , method = RequestMethod.GET)
    public String searchNewsGet
            (@RequestParam(value="searchParameter", required=false,defaultValue="") String name,
             @RequestParam(value="searchParameter", required=false,defaultValue="") String text,
             @RequestParam(value="searchParameter", required=false,defaultValue="1") int categoryID,
             Model model) {
            List<News> searchNews= newsRepository.search(name,text, categoryID);
             model.addAttribute("searchNews",searchNews);
             return "/searchnews";
    }
}