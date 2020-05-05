package com.wang.springboot02.service;


import com.wang.springboot02.dao.CityRepostory;
import com.wang.springboot02.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepostory cityRepostory;

    public List<City> findAll(){
        List<City> all = cityRepostory.findAll();
        return all;
    }
}
