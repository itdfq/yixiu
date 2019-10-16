package com.yixiu.service;

import com.yixiu.Users;

import java.util.List;

public interface IUsersService {
    public List<Users> findAll(int page,int size) throws Exception;
}
