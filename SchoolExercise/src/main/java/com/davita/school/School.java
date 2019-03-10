package com.davita.school;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	
	@Id
	private String schoolid;
	private String schoolname;
	private String city;
	private String state;
	private String countyname;
	private String year;
	private int techfulltime;
	private String pupiltechratio;
	public String getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountyname() {
		return countyname;
	}
	public void setCountyname(String countyname) {
		this.countyname = countyname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTechfulltime() {
		return techfulltime;
	}
	public void setTechfulltime(int techfulltime) {
		this.techfulltime = techfulltime;
	}
	public String getPupiltechratio() {
		return pupiltechratio;
	}
	public void setPupiltechratio(String pupiltechratio) {
		this.pupiltechratio = pupiltechratio;
	}
	@Override
	public String toString() {
		return "School [schoolid=" + schoolid + ", schoolname=" + schoolname + ", city=" + city + ", state=" + state
				+ ", countyname=" + countyname + ", year=" + year + ", techfulltime=" + techfulltime
				+ ", pupiltechratio=" + pupiltechratio + "]";
	}
	
	
	
	
	
	
	
	

}
