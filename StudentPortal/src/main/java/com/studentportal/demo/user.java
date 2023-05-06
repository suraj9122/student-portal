package com.studentportal.demo;

public class user {
	private String id;
	private String pass;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", pass=" + pass + "]";
	}
	public user(String id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	


}
