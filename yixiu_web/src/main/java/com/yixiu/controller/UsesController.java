package com.yixiu.controller;

import com.github.pagehelper.PageInfo;
import com.yixiu.Users;
import com.yixiu.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsesController {
    @Autowired
    private IUsersService usersService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required =true,defaultValue = "1")int page,@RequestParam(name="size",required = true,defaultValue ="4")int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Users> users =  usersService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(users);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("users-list");
        return mv;
    }
}
