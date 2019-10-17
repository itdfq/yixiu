package com.yixiu.service.impl;

import com.github.pagehelper.PageHelper;
import com.yixiu.Users;
import com.yixiu.dao.IUsersDao;
import com.yixiu.service.IUsersService;
import org.apache.ibatis.annotations.Param;
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

    @Override
    public void resign(Users users) {
        iUsersDao.resign(users);
    }

    @Override
    public Users findById(Integer id) {
        return iUsersDao.findById(id);
    }


    @Override
    public void delete(Integer id,Integer num) {
        System.out.println(num);
        if (num==0){
            num=1;
        }
        else if (num==1){
            num=0;
        }
        System.out.println(num);
        iUsersDao.delete(id,num);
    }

    @Override
    public Users findByPhone(String phone) {
        return iUsersDao.findByPhone(phone);
    }

    @Override
    public void update( Users users) {
        iUsersDao.update(users);
    }

    @Override
    public Users login(String username, String password) {

        return  iUsersDao.login(username, password);
    }
}
