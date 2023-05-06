package com.studentportal.demo;

public class Register {
private String nm;
private Integer ct;
private String mail;
public String getNm() {
	return nm;
}
public void setNm(String nm) {
	this.nm = nm;
}
public Integer getCt() {
	return ct;
}
public void setCt(Integer ct) {
	this.ct = ct;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
@Override
public String toString() {
	return "Register [nm=" + nm + ", ct=" + ct + ", mail=" + mail + "]";
}
public Register(String nm, Integer ct, String mail) {
	super();
	this.nm = nm;
	this.ct = ct;
	this.mail = mail;
}



}
