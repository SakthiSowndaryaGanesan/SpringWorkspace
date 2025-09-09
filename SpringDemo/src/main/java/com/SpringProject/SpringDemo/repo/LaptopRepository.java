package com.SpringProject.SpringDemo.repo;

import com.SpringProject.SpringDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database");
    }
}
