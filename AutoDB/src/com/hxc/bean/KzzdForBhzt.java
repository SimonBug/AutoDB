package com.hxc.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hxc.base.IdEntity;

@Entity
@Table(name = "kzzdforbhzt")
public class KzzdForBhzt extends IdEntity{
	private String k_key;
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "bhztId")
	private Bhzt bhzt;

	public String getKey() {
		return k_key;
	}

	public void setKey(String k_key) {
		this.k_key = k_key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Bhzt getBhzt() {
		return bhzt;
	}

	public void setBhzt(Bhzt bhzt) {
		this.bhzt = bhzt;
	}
	
	

}
