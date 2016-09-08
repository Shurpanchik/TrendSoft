/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.trendsofttesttask.entities;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author таня
 */

public interface NewsRepository extends CrudRepository<News,Integer>{
    @Query(value="SELECT *  FROM NEWS  WHERE NEWS.NAME LIKE %:name%  AND NEWS.TEXT like %:text%  AND NEWS.CATEGORY_ID = :categoryID " , nativeQuery = true)
    List <News> search(@Param("name") String name,@Param("text") String text, @Param("categoryID") int categoryID );
    
}
