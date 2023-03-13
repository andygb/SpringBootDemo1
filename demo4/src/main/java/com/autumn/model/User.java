package com.autumn.model;

import lombok.Data;

/**
 * @author shishaofei
 * @since 2023/3/6
 */
@Data
public class User {

    private int id;

    private String name;

    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
