/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask;

import com.shur.trendsofttesttask.entities.News;
import com.shur.trendsofttesttask.entities.NewsRepository;
import java.util.Date;
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
public class DeleteNewsController {
    @Autowired
    private NewsRepository newsRepository;
    @RequestMapping(value = "/deletenews/{id}")
    public String deleteNewsPost(@PathVariable("id") int id, Model model) {
            newsRepository.delete(id);
             return "redirect:/news";
    }
}
