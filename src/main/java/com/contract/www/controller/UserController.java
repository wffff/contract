package com.contract.www.controller;

import com.contract.www.baseconfig.BasePage;
import com.contract.www.baseconfig.ReturnMessage;
import com.contract.www.entity.UserEntity;
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
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    @RequestMapping("/")
    public String home(){
        return "/user/index";
    }

    @RequestMapping("/page")
    @ResponseBody
    public ReturnMessage<List<UserEntity>> page(BasePage basePage) {
        Page<UserEntity> userEntities = iUserService.pageUserByConditions(basePage);
        return ReturnMessage.success((int) userEntities.getTotalElements(), userEntities.getContent());
    }
}
