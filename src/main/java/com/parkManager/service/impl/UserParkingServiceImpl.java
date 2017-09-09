package com.parkManager.service.impl;

import com.parkManager.entitiy.ParkinglotCustom;
import com.parkManager.mapper.usersMapperCustom;
import com.parkManager.service.UserParkingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 樱满集0_0 on 2017/9/9.
 */
public class UserParkingServiceImpl implements UserParkingService {

    @Autowired
    private usersMapperCustom usersMapperCustom;

    public List<ParkinglotCustom> selectUsersParkinglot(int id) throws Exception {

        List<ParkinglotCustom> parks=usersMapperCustom.selectUsersParkinglot(id);

        return parks;

    }
}
