package edu.uet.student;

import edu.uet.course.Course;

public class StudentCourse {
public static String csvFile="D:\\StudentCourses.csv";
private int	studentCourseID;
private Course	courseID;
private Student	studentID;
private String	section;
public int getStudentCourseID() {
	return studentCourseID;
}
public void setStudentCourseID(int studentCourseID) {
	this.studentCourseID = studentCourseID;
}
public Course getCourseID() {
	return courseID;
}
public void setCourseID(Course courseID) {
	this.courseID = courseID;
}
public Student getStudentID() {
	return studentID;
}
public void setStudentID(Student studentID) {
	this.studentID = studentID;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public String toString() {
	String str=null;
	str= this.studentCourseID+","+this.courseID.getCourseID()+","+this.studentID.getPersonID()+","+this.section;
	return str;
	}
}
