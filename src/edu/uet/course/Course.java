package edu.uet.course;

public class Course {
public static String csvFile="D:\\Courses.csv";
private int courseID;
private String courseCode;
private String courseTitle;
private String courseDesc;
private String courseCreditHour;


private Course coursePrerequistID;


public int getCourseID() {
	return courseID;
}


public void setCourseID(int courseID) {
	this.courseID = courseID;
}


public String getCourseCode() {
	return courseCode;
}


public void setCourrseCode(String courseCode) {
	this.courseCode = courseCode;
}


public String getCourseTitle() {
	return courseTitle;
}


public void setCourrseTitle(String courseTitle) {
	this.courseTitle = courseTitle;
}


public String getCourseDesc() {
	return courseDesc;
}


public void setCourseDesc(String courseDesc) {
	this.courseDesc = courseDesc;
}


public String getCourseCreditHour() {
	return courseCreditHour;
}


public void setCourseCreditHour(String courseCreditHour) {
	this.courseCreditHour = courseCreditHour;
}


public Course getCoursePrerequistID() {
	return coursePrerequistID;
}


public void setCoursePrerequistID(Course coursePrerequistID) {
	this.coursePrerequistID = coursePrerequistID;
}

public String toString() {
	String str=null;
	str= this.courseID+","+this.courseCode+","+this.courseTitle+","+this.courseCreditHour+","+this.courseDesc+","+this.coursePrerequistID;
	return str;
	
}

}
