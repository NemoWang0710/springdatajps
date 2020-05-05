package com.wang.springboot02.controller;


import com.wang.springboot02.entity.City;
import com.wang.springboot02.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/city")
public class MainController {

    @Autowired
    CityService cityService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<City> findAll(){
        List<City> all = cityService.findAll();
        return all;
    }
}
