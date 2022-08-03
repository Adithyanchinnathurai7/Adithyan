package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dtouser {
@Id
private int userid;
private String username;
private int flag;
private String password;
private String image;
private String email;
private Long phonenumber;
private String city;
private String address;

public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Long phonenumber) {
	this.phonenumber = phonenumber;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
