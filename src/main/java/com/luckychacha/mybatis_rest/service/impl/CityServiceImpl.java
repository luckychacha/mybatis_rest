package com.luckychacha.mybatis_rest.service.impl;

import com.luckychacha.mybatis_rest.dao.CityDao;
import com.luckychacha.mybatis_rest.domain.City;
import com.luckychacha.mybatis_rest.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }
}
