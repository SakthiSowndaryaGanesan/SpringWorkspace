package com.SpringProject.SpringDemo.service;

import com.SpringProject.SpringDemo.LaptopRepository;
import com.SpringProject.SpringDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("Laptop service method called");
        repo.save(lap);
    }

//    public boolean isGoodForProg(Laptop lap){
//        return true;
//    }


}
