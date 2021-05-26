package com.javapandeng.po;

import java.io.Serializable;

/**
 * 送货员
 */
public class Delivery implements Serializable {

    /**主键*/
    private Integer id;
    /**登录名*/
    private String userName;
    /**密码*/
    private String passWord;
    /**姓名*/
    private String realName;

    private String sex;

    public Delivery(Integer id, String userName, String passWord, String realName,String sex) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.realName = realName;
        this.sex = sex;
    }

    public Delivery() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }


    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
