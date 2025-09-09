package com.LevelOneCache;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Alien_table")
public class Alien {
@Id
	private int aid;
	
	private String aname;
	private String Alien_color;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	public String getColor() {
		return Alien_color;
	}
	public void setColor(String Alien_color) {
		this.Alien_color = Alien_color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + Alien_color + "]";
	}
	
	
	}
	


