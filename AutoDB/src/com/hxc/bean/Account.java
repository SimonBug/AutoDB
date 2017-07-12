package com.hxc.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hxc.base.IdEntity;

@Entity
@Table(name="account")
public class Account extends IdEntity {
	
	@Column(name="name")
	private String name;
	@Column(name="money")
	private double money;
	
	public Account() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [ name=" + name + ", money=" + money
				+ "]";
	}
}
