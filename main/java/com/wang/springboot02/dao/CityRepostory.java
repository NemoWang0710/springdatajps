package com.wang.springboot02.dao;

import com.wang.springboot02.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepostory  extends JpaRepository<City, Integer> {
}
