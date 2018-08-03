package com.contract.www.service;

import com.contract.www.baseconfig.BasePage;
import com.contract.www.entity.UserEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Danny on 2018/7/9.
 */
public interface IUserService {
    //分页查询用户
    Page<UserEntity> pageUserByConditions(BasePage basePage);

    //查询用户
    List<UserEntity> listUserByConditions();

    //创建用户
    List<UserEntity> createUser(String username, String password);

    UserEntity findByName(String username);
}
