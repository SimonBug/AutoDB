package com.hxc.bean;

import com.hxc.base.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
@Entity
@Table(name="user")
public class User extends IdEntity {

    private String userName;
    private String userMoney;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(String userMoney) {
        this.userMoney = userMoney;
    }
}
