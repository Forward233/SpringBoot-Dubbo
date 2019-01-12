package com.dubbo.service;


import com.dubbo.domain.City;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by Jaycekon on 20/09/2017.
 */
public interface CityDubboService2 {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
