/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask.entities;
import javax.persistence.*;
/**
 *
 * @author таня
 */
@Entity
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
   private String name;

    public Category() {
    }

   
    public Category(Integer category_id, String name) {
        this.id = category_id;
        this.name = name;
    }

   
    /**
     * @return the category_id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param category_id the category_id to set
     */
    public void setId(Integer category_id) {
        this.id = category_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


}
