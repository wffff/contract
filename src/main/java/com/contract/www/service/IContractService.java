package com.contract.www.service;

import com.contract.www.baseconfig.BasePage;
import com.contract.www.entity.ContractEntity;
import com.contract.www.entity.UserEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Danny on 2018/7/9.
 */
public interface IContractService {
    //分页查询
    Page<ContractEntity> pageContractByConditions(BasePage basePage);
}
