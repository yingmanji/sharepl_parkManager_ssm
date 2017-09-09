package com.parkManager.mapper;

import com.parkManager.entitiy.ParkinglotCustom;

import java.util.List;

/**
 * Created by 樱满集0_0 on 2017/9/9.
 */
public interface usersMapperCustom {

    public List<ParkinglotCustom> selectUsersParkinglot(int id) throws Exception;
}
