/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask.entities;
import com.shur.trendsofttesttask.entities.Category;
import  org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author таня
 */

public interface CategoryRepository extends CrudRepository<Category, Integer>{
    
}
