package com.yixiu.controller;

import com.yixiu.Users;
import com.yixiu.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsesController {
    @Autowired
    private IUsersService usersService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        List<Users> users = usersService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("userlist", users);
        mv.setViewName("user-list");
        return mv;
    }
}
