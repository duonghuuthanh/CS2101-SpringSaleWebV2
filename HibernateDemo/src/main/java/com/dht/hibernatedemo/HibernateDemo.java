/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.dht.hibernatedemo;

import com.dht.pojo.Category;
import com.dht.pojo.Product;
import com.dht.repository.impl.CategoryRepositoryImpl;
import com.dht.repository.impl.ProductRepositoryImpl;
import com.dht.repository.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        StatsRepositoryImpl s = new StatsRepositoryImpl();
        s.statsRevenueByPeriod(2020, "QUARTER").forEach(ss -> System.out.printf("%d: %d\n\n", ss[0], ss[1]));
        
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCategories().forEach(c -> System.out.println(c.getName()));
//       
//            ProductRepositoryImpl ser = new ProductRepositoryImpl();
//            
//            Product p = new Product();
//            p.setName("ABC");
//            p.setPrice(12000000l);
//            p.setCategoryId(s.getCateById(1));
//            ser.addOrUpdate(p);
//            
//            Map<String, String> params = new HashMap<>();
//            params.put("fromPrice", "18000000");
//            params.put("toPrice", "21000000");
//            
//            s.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f - %s\n", p.getId(), p.getName(), 
//                    p.getPrice(), p.getCategory().getName()));
//            Query q = s.createQuery("From Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));
        
        
    }
}
