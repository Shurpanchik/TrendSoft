package com.shur.trendsofttesttask;

import com.shur.trendsofttesttask.entities.Category;
import com.shur.trendsofttesttask.entities.CategoryRepository;
import com.shur.trendsofttesttask.entities.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{   
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private NewsRepository newsRepository;
     
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        categoryRepository.save(new Category(1, "TEST"));
        categoryRepository.save(new Category(2, "ANOTHER TEST"));
        categoryRepository.save(new Category(3, "sfjkhtgdkj"));

        Iterable<Category> categories = categoryRepository.findAll();
        for(Category category: categories) {
            System.out.println(category.getId() + " " + category.getName());
        }
    }

    
}
