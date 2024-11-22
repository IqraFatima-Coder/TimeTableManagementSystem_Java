package edu.uet.teacher;

import edu.uet.course.Course;

public class TeacherCourse {
public static String csvFile="D:\\TeacherCourses.csv";
private int	teacherCourseID;
private Course courseID;
private Teacher	teacherID;
private String section;
public int getTeacherCourseID() {
	return teacherCourseID;
}
public void setTeacherCourseID(int teacherCourseID) {
	this.teacherCourseID = teacherCourseID;
}
public Course getCourseID() {
	return courseID;
}
public void setCourseID(Course courseID) {
	this.courseID = courseID;
}
public Teacher getTeacherID() {
	return teacherID;
}
public void setTeacherID(Teacher teacherID) {
	this.teacherID = teacherID;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public String toString() {
	String str=null;
	str= this.teacherCourseID+","+this.courseID.getCourseID()+","+this.teacherID.getPersonID()+","+this.section;
	return str;
	}	

}
