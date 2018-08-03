package com.contract.www.controller;

import com.contract.www.baseconfig.BasePage;
import com.contract.www.baseconfig.ReturnMessage;
import com.contract.www.entity.ContractEntity;
import com.contract.www.entity.UserEntity;
import com.contract.www.service.IContractService;
import com.contract.www.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Danny on 2018/7/9.
 */
@Controller
@RequestMapping("/contract")
public class ContractController {
    @Resource
    private IContractService iContractService;

    @RequestMapping("/page")
    @ResponseBody
    public ReturnMessage<List<ContractEntity>> page(BasePage basePage) {
        Page<ContractEntity> c = iContractService.pageContractByConditions(basePage);
        return ReturnMessage.success((int) c.getTotalElements(), c.getContent());
    }
}
