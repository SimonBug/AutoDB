package com.hxc.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Lists;
import com.hxc.base.IdEntity;

@Entity
@Table(name = "zjz")
public class Zjz extends IdEntity  {
	private static final long serialVersionUID = 1L;
	private String zjzmc;//专家组名称
	private String remark;//专家组备注
	private String zyml;//专业门类
	private String shyj;//审核意见
	private String she;//是否通过
	private String ids;//id组
	private String idss;//
	public String getIdss() {
		return idss;
	}
	public void setIdss(String idss) {
		this.idss = idss;
	}
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "zjz")
	private List<Bhzt> bhzts = Lists.newArrayList();

	
	
	public List<Bhzt> getBhzts() {
		return bhzts;
	}
	public void setBhzts(List<Bhzt> bhzts) {
		this.bhzts = bhzts;
	}
	public String getZjzmc() {
		return zjzmc;
	}
	public void setZjzmc(String zjzmc) {
		this.zjzmc = zjzmc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getZyml() {
		return zyml;
	}
	public void setZyml(String zyml) {
		this.zyml = zyml;
	}
	public String getShyj() {
		return shyj;
	}
	public void setShyj(String shyj) {
		this.shyj = shyj;
	}
	public String getShe() {
		return she;
	}
	public void setShe(String she) {
		this.she = she;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
}
