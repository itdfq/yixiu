package com.yixiu.dao;

import com.yixiu.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUsersDao {
    @Select("select * from users")
    public List<Users> findAll() throws Exception;
    @Insert("insert into users(name,address,mobilePhone,weChat,num,password) values (#{name},#{address},#{mobilePhone},#{weChat},1,#{password})")
    void resign(Users users);
    @Select("select * from users where id = #{id}")
    Users findById(Integer id);
    @Update("update users set num = #{num} where id = #{id}")
    void delete(@Param("num")Integer num,@Param("id")Integer id);
    @Select("select * from users where mobilePhone = #{mobilePhone}")
    Users findByPhone(String phone);
    @Update("update users set name = #{name},address= #{address},mobilePhone=#{mobilePhone},weChat = #{weChat},num=#{num} where id=#{id}")
    void update(Users users);
    @Select("select * from users where mobilePhone=#{mobilePhone} and password = #{password}")
    Users login(@Param("mobilePhone") String username, @Param("password")String password);
}
