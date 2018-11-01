package com.luckychacha.mybatis_rest.controller;

import com.luckychacha.mybatis_rest.domain.City;
import com.luckychacha.mybatis_rest.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method =RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        System.out.println(city.getCityName());
        cityService.saveCity(city);
    }
}
