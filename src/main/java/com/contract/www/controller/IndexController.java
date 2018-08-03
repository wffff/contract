package com.contract.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Danny on 2018/7/12.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/principal")
    @ResponseBody
    public Principal principal(Principal principal) {
        return principal;
    }

//    @RequestMapping("/main")
//    public String home(@RequestParam(value = "page", required = false) String page, Model model, HttpServletRequest request) {
//        model.addAttribute(WebConstants.MAIN_PAGE, !RegexUtils.notNull(page) ? WebConstants.MAIN_PAGE : page);
//        Map<String, Object> menus = this.menusBuilder(page);
//        model.addAllAttributes(menus);
//        model.addAllAttributes(request.getParameterMap());
//        request.getSession().setAttribute("func", menus.get("func"));
//        request.getSession().setAttribute("tabs", menus.get("tabs"));
//        request.getSession().setAttribute("menus", menus.get("menus"));
//        return WebConstants.INDEX_PAGE;
//    }

}
