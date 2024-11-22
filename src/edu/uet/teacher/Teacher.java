package edu.uet.teacher;

import edu.uet.person.Person;

public class Teacher extends Person {
public static String csvFile="D:\\Teachers.csv";
private int teacherID;

public int getTeacherID() {
	return teacherID;
}

public void setTeacherID(int teacherID) {
	this.teacherID = teacherID;
}
public String toString() {
	String str=null;
	str= ""+this.teacherID;
	return str;
	}
}
