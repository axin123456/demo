package com.orbyun.testConfiguration;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String tel;

    public User() {
        System.out.println("User创建完成...............");
    }

    public User(Integer id, String userName, String password, String tel) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.tel = tel;
    }
}
