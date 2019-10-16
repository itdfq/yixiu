package com.yixiu.service.impl;

import com.github.pagehelper.PageHelper;
import com.yixiu.Users;
import com.yixiu.dao.IUsersDao;
import com.yixiu.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Controller
public class IUsersServiceImpl implements IUsersService {
   @Autowired
   private IUsersDao iUsersDao;
   //分页查询
    @Override
    public List<Users> findAll(int page,int size) throws Exception{
        //pageNum是页码值  pageSize每页显示条数
        PageHelper.startPage(page,size);
        return iUsersDao.findAll();
    }
}
