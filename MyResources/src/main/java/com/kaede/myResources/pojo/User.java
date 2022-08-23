package com.kaede.myResources.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @author kaede
 * @create 2022-08-14 17:03
 *
 * user_id   user_name   user_password   user_headshot
 */

public class User {

    private Integer userId;
    private String userName;
    private String userPassword;
    private String userGender;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GTM+8")
    private Date userBirth;

    public User() {
    }

    public User(Integer userId, String userName, String userPassword, String userGender, Date userBirth) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userGender = userGender;
        this.userBirth = userBirth;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userBirth=" + userBirth +
                '}';
    }
}
