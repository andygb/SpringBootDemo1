package com.autumn.mapper;

import com.autumn.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shishaofei
 * @since 2023/3/6
 */
@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<User> getUsers();

    @Select("select * from users where id = #{id}")
    User getUserById(@Param("id") int id);

    @Select("select * from users where name = #{name}")
    User getUserByName(@Param("name") String name);
}
