package com.contract.www.service.impl;

import com.contract.www.baseconfig.BasePage;
import com.contract.www.entity.ContractEntity;
import com.contract.www.entity.UserEntity;
import com.contract.www.repository.IContractRepository;
import com.contract.www.service.IContractService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Danny on 2018/8/3.
 */
@Service
public class ContractService implements IContractService {
    @Resource
    private IContractRepository iContractRepository;
    @Override
    public Page<ContractEntity> pageContractByConditions(BasePage basePage) {
        ContractEntity c=new ContractEntity();
        c.setDel(false);
        return iContractRepository.findAll(Example.of(c),basePage.getRequestPage());
    }
}
