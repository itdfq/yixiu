package com.yixiu.service.impl;

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
    @Override
    public List<Users> findAll() throws Exception{
        return iUsersDao.findAll();
    }
}
