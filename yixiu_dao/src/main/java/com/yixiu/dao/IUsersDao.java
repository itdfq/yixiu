package com.yixiu.dao;

import com.yixiu.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUsersDao {
    @Select("select * from users")
    public List<Users> findAll() throws Exception;
}
