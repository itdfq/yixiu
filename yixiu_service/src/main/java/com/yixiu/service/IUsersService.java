package com.yixiu.service;

import com.yixiu.Users;

import java.util.List;

public interface IUsersService {
    public List<Users> findAll(int page,int size) throws Exception;

    void resign(Users users);

    Users findById(Integer id);

    void delete(Integer id,Integer num);

    Users findByPhone(String phone);

    void update(Users users);

    Users login(String username, String password);
}
