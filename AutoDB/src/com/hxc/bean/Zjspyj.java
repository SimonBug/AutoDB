package com.hxc.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hxc.base.IdEntity;

@Entity
@Table(name = "zjspyj")
public class Zjspyj extends   IdEntity{
	private String content;//审批内容
	private Date spsj;//审批时间
	private Integer sftg;//是否通过
	private String spr;//审批人员名字
	
	@ManyToOne
	@JoinColumn(name = "bhztId")
	private Bhzt bhzt;
	
	public Bhzt getBhzt() {
		return bhzt;
	}
	public void setBhzt(Bhzt bhzt) {
		this.bhzt = bhzt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSpsj() {
		return spsj;
	}
	public void setSpsj(Date spsj) {
		this.spsj = spsj;
	}
	public String getSpr() {
		return spr;
	}
	public void setSpr(String spr) {
		this.spr = spr;
	}
	public Integer getSftg() {
		return sftg;
	}
	public void setSftg(Integer sftg) {
		this.sftg = sftg;
	}
	
	

}
