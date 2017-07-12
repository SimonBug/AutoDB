package com.hxc.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Lists;
import com.hxc.base.IdEntity;


@Entity
@Table(name = "bhzt")
public class Bhzt extends IdEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2332420511450614968L;
	private String title;//
	private String zyml;//专业门类
	private String zhen;//镇
	private String jiedao;//街道
	private String pc;//批次
	private Date lrsj;//录入时间
	private String fbqk;//发布情况
	private String sbdw;//申报单位
	private String fzrxm;//申报单位负责人姓名
	private String fzrzw;//申报单位负责人职务
	private String fzrdh;//申报单位负责人电话
	private String code;//编号
	private String bz;
	private  Integer sfsb;//是否申报
	private Integer sbzt;//申报状态
	private String zids;
	private String yshzj;
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "bhzt")
	private List<Zjspyj> zjspyjs = Lists.newArrayList();
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "bhzt")
	private List<KzzdForBhzt> kzzds = Lists.newArrayList();
	
	@ManyToOne
	@JoinColumn(name = "bhztTypeId")
	private BhztType bhztType;
	
	
	@ManyToOne
	@JoinColumn(name = "zjzId")
	private Zjz  zjz;
	
	

	public Zjz getZjz() {
		return zjz;
	}
	public void setZjz(Zjz zjz) {
		this.zjz = zjz;
	}
	public Integer getSfsb() {
		return sfsb;
	}
	public void setSfsb(Integer sfsb) {
		this.sfsb = sfsb;
	}
	public Integer getSbzt() {
		return sbzt;
	}
	public void setSbzt(Integer sbzt) {
		this.sbzt = sbzt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getZyml() {
		return zyml;
	}
	public void setZyml(String zyml) {
		this.zyml = zyml;
	}
	public String getZhen() {
		return zhen;
	}
	public void setZhen(String zhen) {
		this.zhen = zhen;
	}
	public String getJiedao() {
		return jiedao;
	}
	public void setJiedao(String jiedao) {
		this.jiedao = jiedao;
	}
	public BhztType getBhztType() {
		return bhztType;
	}
	public void setBhztType(BhztType bhztType) {
		this.bhztType = bhztType;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public Date getLrsj() {
		return lrsj;
	}
	public void setLrsj(Date lrsj) {
		this.lrsj = lrsj;
	}
	public String getFbqk() {
		return fbqk;
	}
	public void setFbqk(String fbqk) {
		this.fbqk = fbqk;
	}
	public String getSbdw() {
		return sbdw;
	}
	public void setSbdw(String sbdw) {
		this.sbdw = sbdw;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFzrxm() {
		return fzrxm;
	}
	public void setFzrxm(String fzrxm) {
		this.fzrxm = fzrxm;
	}
	public String getFzrzw() {
		return fzrzw;
	}
	public void setFzrzw(String fzrzw) {
		this.fzrzw = fzrzw;
	}
	public String getFzrdh() {
		return fzrdh;
	}
	public void setFzrdh(String fzrdh) {
		this.fzrdh = fzrdh;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public List<KzzdForBhzt> getKzzds() {
		return kzzds;
	}
	public void setKzzds(List<KzzdForBhzt> kzzds) {
		this.kzzds = kzzds;
	}
	public String getZids() {
		return zids;
	}
	public void setZids(String zids) {
		this.zids = zids;
	}
	public List<Zjspyj> getZjspyjs() {
		return zjspyjs;
	}
	public void setZjspyjs(List<Zjspyj> zjspyjs) {
		this.zjspyjs = zjspyjs;
	}
	public String getYshzj() {
		return yshzj;
	}
	public void setYshzj(String yshzj) {
		this.yshzj = yshzj;
	}
	
	
	
	
	
	
}
