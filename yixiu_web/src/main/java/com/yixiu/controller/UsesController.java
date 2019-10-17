package com.yixiu.controller;

import com.github.pagehelper.PageInfo;
import com.yixiu.Users;
import com.yixiu.service.IUsersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsesController {
    @Autowired
    private IUsersService usersService;

    private Map<String, Object> map = new HashMap<>();
    //分页查询客户信息
    @RequestMapping("/findAll.do")
    public @ResponseBody Map<String,Object> findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "6") int size) throws Exception {
        try {
            map.clear();
            List<Users> users = usersService.findAll(page, size);
            PageInfo pageInfo = new PageInfo(users);
            map.put("msg",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    //客户注册
    @RequestMapping("/resign.do")
    public @ResponseBody
    Map<String, Object> resign(Users users) throws Exception {
        map.clear();
        try {
            Users byPhone = usersService.findByPhone(users.getMobilePhone());
            if(byPhone!=null){
                map.put("msg","手机号已注册");
            }else {
                usersService.resign(users);
                map.put("msg", 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
        }
        System.out.println(map);
        return map;
    }
    //        @RequestMapping("/add.do")
//    public String save(Users users) throws Exception {
//        usersService.add(users);
//        return "redirect:findAll.do";
//    }
    //按照id查询用户
    @RequestMapping("/findById.do")
    public @ResponseBody Map<String,Object> findById(Integer id) throws Exception {
        map.clear();
       try {
           Users users = usersService.findById(id);
           map.put("msg",users);
       }catch (Exception e){
           e.printStackTrace();
           map.put("msg",e.getMessage());
       }
       return map;
    }
//    @RequestMapping("/delete.do")
//    public String delete(int id) throws Exception {
//        usersService.delete(id);
//        return "redirect:findAll.do";
//    }
 //   表示删除客户（开启或者关闭）
    @RequestMapping("/delete.do")
    public @ResponseBody
    Map<String, Object> delete(Integer id, Integer num) throws Exception {
        map.clear();
        try {
            usersService.delete(id, num);
            map.put("msg", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", e.getMessage());
        }
        return map;
    }
    //通过手机号查询
    @RequestMapping("/findByPhone.do")
    public @ResponseBody
    Map<String, Object> findByPhone(String phone) throws Exception {
        map.clear();
        try {
            Users byPhone = usersService.findByPhone(phone);
            map.put("msg",byPhone);
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    //修改客户数据
    @RequestMapping("/update.do")
    public @ResponseBody Map<String,Object> update(Users users)throws Exception{
        map.clear();
        try {
            users=null;
            usersService.update(users);
            map.put("msg",1);
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
    //登录方法
    @RequestMapping("/login.do")
    public @ResponseBody Map<String,Object> login(@Param("mobilePhone") String username, @Param("password") String password){
        map.clear();
        try {
            Users users = usersService.findByPhone(username);
            if(users.getNum()==0){
                map.put("msg", "对不起，您的账号禁止访问！");
            }else{
                Users login = usersService.login(username, password);
                if(login==null){
                    map.put("msg","用户名或密码错误！！");
                }else{
                    map.put("msg",1);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg",e.getMessage());
        }
        return map;
    }
//    @RequestMapping("/findByPhone.do")
//    public ModelAndView findById(String phone) throws Exception {
//        ModelAndView mv = new ModelAndView();
//        Users users = usersService.findByPhone(phone);
//        //mv.addObject("users", users);
//        //mv.setViewName("users-list");
//        System.out.println(users);
//        return mv;
//    }
}
