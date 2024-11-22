package edu.uet.person;

public class Person {
public static String csvFile="D:\\Persons.csv";
private int personID;
private String title;
private String foreName;
private String surName;
private String gender;
private String address;
private int age;
public int getPersonID() {
	return personID;
}
public void setPersonID(int personID) {
	this.personID = personID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getForeName() {
	return foreName;
}
public void setForeName(String foreName) {
	this.foreName = foreName;
}
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String toString() {
	String str=null;
	str= this.personID+","+this.foreName+","+this.surName+","+this.age+","+this.gender+","+this.address;
	return str;
	
}

}
