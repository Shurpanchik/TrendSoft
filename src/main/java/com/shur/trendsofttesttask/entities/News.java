/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask.entities;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author ����
 */
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(length = 1000)
    private String text;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar date;
    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public News() {}

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the date
     */
    public Calendar getDate() {
        return date;
    }

    public  String getDateWithFormat(){
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        return format1.format(date.getTime());
    }

    /**
     * @param date the date to set
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }
}
