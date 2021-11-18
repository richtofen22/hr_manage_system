package com.rain.domain;

import java.io.Serializable;

public class Toudi  implements Serializable{
	private Integer noticeid;
	private Integer userid;
	public Toudi(){
		super();
	}
	public Integer getNoticeid() {
		return noticeid;
	}
	public void setNoticeid(Integer noticeid) {
		this.noticeid = noticeid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}
