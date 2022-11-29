package com.demo07.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DemoModel_1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dmid;
	
	@Column(nullable = false)
	private String dmname;
	private String dmcolor;
	private String dmcompany;
	public int getDmid() {
		return dmid;
	}
	public void setDmid(int dmid) {
		this.dmid = dmid;
	}
	public String getDmname() {
		return dmname;
	}
	public void setDmname(String dmname) {
		this.dmname = dmname;
	}
	public String getDmcolor() {
		return dmcolor;
	}
	public void setDmcolor(String dmcolor) {
		this.dmcolor = dmcolor;
	}
	public String getDmcompany() {
		return dmcompany;
	}
	public void setDmcompany(String dmcompany) {
		this.dmcompany = dmcompany;
	}
	public DemoModel_1(int dmid, String dmname, String dmcolor, String dmcompany) {
		super();
		this.dmid = dmid;
		this.dmname = dmname;
		this.dmcolor = dmcolor;
		this.dmcompany = dmcompany;
	}
	public DemoModel_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
