package com.itheima;

public class User1 {
	private int id;
	private String name;
	private String password;
	//�вι���
	public User1(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	

}
