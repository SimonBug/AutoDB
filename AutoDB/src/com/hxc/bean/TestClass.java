package com.hxc.bean;



import com.hxc.base.IdEntity;
import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
@Entity
@Table(name = "testclass")
public class TestClass extends IdEntity {
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
