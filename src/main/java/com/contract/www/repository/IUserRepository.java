package com.contract.www.repository;

import com.contract.www.baseconfig.BaseRepository;
import com.contract.www.entity.UserEntity;

/**
 * Created by Danny on 2018/7/9.
 */
public interface IUserRepository extends BaseRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
    //创建用户
}
