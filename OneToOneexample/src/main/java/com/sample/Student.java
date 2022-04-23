package com.sample;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

@Entity
@Table(name="studentdetail")
public class Student 
{
	@Id
	@GeneratedValue
	private int sid;
	@Column(name="stname",length=30)
	private String sname;
	@Column(name="stcourse",length=30)
	private String course;
	@OneToOne(cascade = CascadeType.ALL)                    //reference for the address in student table
    @JoinColumn(name="address")
	private Adress ad;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Adress getAd() {
		return ad;
	}
	public void setAd(Adress ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + ", ad=" + ad + "]";
	}
	
	
	
	



}
