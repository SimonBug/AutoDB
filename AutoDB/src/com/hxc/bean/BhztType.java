package com.hxc.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Lists;
import com.hxc.base.IdEntity;
/**
 * 保护载体类别表
 * @author wangxl
 *
 */
@Entity
@Table(name = "bhzttype")
public class BhztType extends IdEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8668642384716909404L;
	private  String name;
	private  String createUser;
	private Date  CreateTime;
	private String miaoshu;
	private String  bhztlevel;
	private String jspUrl;
	private String type;
	private  Integer sfsb;
	
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "bhztType")
	private List<Bhzt> bhzts = Lists.newArrayList();
	
	

	public Integer getSfsb() {
		return sfsb;
	}

	public void setSfsb(Integer sfsb) {
		this.sfsb = sfsb;
	}

	public List<Bhzt> getBhzts() {
		return bhzts;
	}

	public void setBhzts(List<Bhzt> bhzts) {
		this.bhzts = bhzts;
	}

	public String getJspUrl() {
		return jspUrl;
	}

	public void setJspUrl(String jspUrl) {
		this.jspUrl = jspUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}




	public String getBhztlevel() {
		return bhztlevel;
	}

	public void setBhztlevel(String bhztlevel) {
		this.bhztlevel = bhztlevel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	

}
